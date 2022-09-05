package controller;

import model.ProjectEntity;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProjectController {

    public void save(){
        //Criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "INSERT INTO tasks (idProject, name, description, completed, notes, deadline, createdAt, updatedAt)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";


        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{

        }catch (SQLException ex){
            throw new RuntimeException("erro", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }





    public void update(){
        //criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "UPDATE tasks SET idProject = ?," +
                " name = ?," +
                " description = ?," +
                " notes = ?," +
                " deadline = ?," +
                " completed = ?," +
                " createdAt = ?," +
                " updatedAt = ? WHERE id = ?";

        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{

        }catch (SQLException ex){
            throw new RuntimeException("erro", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }






    public void removeById(){
        //criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "DELETE FROM tasks WHERE id = ?";


        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{

        }catch (SQLException ex){
            throw new RuntimeException("erro", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }





    public List<ProjectEntity> getAll(){
        //criando a query SQL para acontecer dentro do DB. As interrogações serão substituídas com Set do Statement
        String sql = "SELECT * FROM tasks where idProject = ?";

        //inicializações relativas ao meu sql:
        //interface Connection que eu implementei o método getConnection na minha classe ConnectionFactory.
        Connection connection = null;//só inicializei pois precisa ser global
        //interface PreparedStatement em que eu uso para ter os métodos prepareStatement(sql) eexecuteQuery()
        //e todos os valores set para as interrogações
        PreparedStatement statement = null;//só inicializei pois precisa ser global

        try{

        }catch (SQLException ex){
            throw new RuntimeException("erro", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }return null;}
}
