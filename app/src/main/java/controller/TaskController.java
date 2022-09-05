package controller;

import model.TaskEntity;
import util.ConnectionFactory;

import java.nio.channels.ScatteringByteChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TaskController {

    public void save(TaskEntity task){
        String sql = "INSERT INTO tasks (idProject, name, description, completed, notes, deadline, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;//só inicializei pois precisa ser global
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{ //aqui eu estou pegando aquela interrogação da query sql e trocando ela pelos respectivos campos das tarefas
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, (java.sql.Date) new Date(task.getCreatedAt().getTime())); //estou convertendo essa data de java util para java sql Aula 11.C min 10:27
            statement.setDate(7, (java.sql.Date) new Date(task.getUpdatedAt().getTime()));
            statement.setDate(8, (java.sql.Date) new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        }catch (SQLException ex){
            throw new RuntimeException("erro" + ex.getMessage(), ex);
        }finally {//esse bloco sempre será executado ao final da execução do bloco try independente de ocorrer o erro
            ConnectionFactory.closeConnection(connection, statement);//fechando a conexão connection que eu criei lá em cima


        }

    }
    public void update(TaskEntity task){
        String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ?, notes = ?, deadline = ?, completed = ?, createdAt = ?, updatedAt = ? WHERE id = ?";

        Connection connection = null;//só inicializei pois precisa ser global
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try {
            //Cria uma conexão com o banco
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);

            //setando os valores do statement
            statement.setInt     (1, task.getIdProject());
            statement.setString  (2, task.getName());
            statement.setString  (3, task.getDescription());
            statement.setString  (4, task.getNotes());
            statement.setDate    (5, new java.sql.Date(task.getDeadline().getTime()));
            statement.setBoolean (6, task.isIsCompleted());
            statement.setDate    (7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate    (8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.setInt     (9, task.getId());

            //Executa a sql para insersão dos dados
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro em atualizar a tarefa", ex);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
    }

    public void removeById(int taskId) throws SQLException {
        String sql = "DELETE FROM tasks WHERE id = ?"; //comando  SQL para deletar dentro do banco de dados
        Connection conn = null;//só inicializei pois precisa ser global
        PreparedStatement statement = null;//só inicializei pois precisa ser global
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);//aqui eu estou pegando aquela interrogação da query sql e trocando ela pelo taskId que eu receber como parametro para deletar
            statement.execute();

        }catch(SQLException e){
            throw new SQLException("errro ao deletar a tarefa");

        }finally {//esse bloco sempre será executado ao final da execução do bloco try independente de ocorrer o erro
            ConnectionFactory.closeConnection(conn, statement);//fechando a conexão conn que eu criei lá em cima

        }
    }
    public List<TaskEntity> getAll(int idProject){ //List<passo uma Entity>
        String sql = "SELECT * FROM tasks where idProject = ?";

        //a lista que irei retornar no fim do método
        List<TaskEntity> tasks = new ArrayList<>();

        //System.out.printf("olá, ?",  "jessé");

        Connection connection = null; //só inicializei pois precisa ser global
        PreparedStatement statement = null; //só inicializei pois precisa ser global

        //interface que vai recuperar os dados do banco de dados (que recebe do banco de dados)
        ResultSet resultSet = null; //polimorfismo

        try {

            connection = ConnectionFactory.getConnection(); //estabelecemos uma conexão com o DB
            statement = connection.prepareStatement(sql); //preparamaos o  sql

            statement.setInt(1, idProject);  //setamos qual projeto queremos buscar pelo ID

            resultSet = statement.executeQuery(); //me devolve o valor de resposta do SELECT do banco de dados

            //Enquanto existir dados no banco de dados, faça
            while (resultSet.next()) { //enquanto houver resposta pelo ID que buscamos execute: (posso ter um valor ou vários, por isso o .next)

                TaskEntity task = new TaskEntity(); //cria uma nova tarefa

                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setCreatedAt(resultSet.getDate("updatedAt"));

                //Adiciono o contato recuperado, a lista de contatos
                tasks.add(task); //aqui eu coloco as tarefas que eu criei dentro do ArrayList que eu criei la em cima
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar/inserir as tarefas" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        return tasks;
    }


}
