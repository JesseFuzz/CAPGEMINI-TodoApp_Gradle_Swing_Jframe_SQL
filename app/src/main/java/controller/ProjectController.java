package controller;

import model.ProjectEntity;
import util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectController {

    public void save(ProjectEntity project){
        //Criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "INSERT INTO projects (name, description, createdAt, updatedAt)" +
                "VALUES (?, ?, ?, ?)";


        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{
            //aqui eu crio a minha conexão
            connection = ConnectionFactory.getConnection();
            //executo minha query baseado no sql da variável sql acima
            statement = connection.prepareStatement(sql);

            //seto os meus valores
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));

            //executo tudo
            statement.execute();

        }catch (SQLException ex){
            throw new RuntimeException("erro ao salvar o projeto", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }





    public void update(ProjectEntity project){
        //criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "UPDATE projects SET" +
                " name = ?," +
                " description = ?," +
                " createdAt = ?," +
                " updatedAt = ?" +
                "WHERE id = ?";

        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{
            //aqui eu crio a minha conexão
            connection = ConnectionFactory.getConnection();
            //executo minha query baseado no sql da variável sql acima
            statement = connection.prepareStatement(sql);

            //seto os meus valores
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

            //executo tudo
            statement.execute();


        }catch (SQLException ex){
            throw new RuntimeException("erro ao atualizar o projeto", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }






    public void removeById(int idProject){
        //criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "DELETE FROM projects WHERE id = ?";


        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{
            //aqui eu crio a minha conexão
            connection = ConnectionFactory.getConnection();
            //executo minha query baseado no sql da variável sql acima
            statement = connection.prepareStatement(sql);
            //seto meu parametro que quero mudar (?)
            statement.setInt(1, idProject);
            statement.execute(sql);

        }catch (SQLException ex){
            throw new RuntimeException("erro ao deletar o projeto", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }





    public List<ProjectEntity> getAll(){
        //criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "SELECT * FROM projects";

        List<ProjectEntity> projects = new ArrayList<>();

        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set para as interrogações
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        //interface que vai recuperar os dados do banco de dados (que recebe do banco de dados)
        //quando eu faço um SELECT eu preciso pegar esse resultado do DB
        ResultSet resultSet = null; //polimorfismo. Só inicializo

        try{
            //aqui eu crio a minha conexão
            connection = ConnectionFactory.getConnection();
            //executo minha query baseado no sql da variável sql acima
            statement = connection.prepareStatement(sql);

            //me devolve o valor de resposta do SELECT do banco de dados
            resultSet = statement.executeQuery();


            while(resultSet.next()){//enquanto esse meu retorno do resultSet tiver próximo faça:
                ProjectEntity project = new ProjectEntity();//tive que criar um construtor vazio no ProjectEntity

                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));

                projects.add(project);
            }

        }catch (SQLException ex){
            throw new RuntimeException("erro ao buscar os projetos", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }return projects;
    }
}
