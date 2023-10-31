package controller;

import java.sql.Connection;
import java.sql.Date;                  //importando o Date do pacote SQL
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Tasks;
import util.ConnectionFactory;

public class TaskController {

    public void save(Tasks task) {
        String sql = "INSERT INTO tasks (IdProject,"
                + "name, "
                + "description, "
                + "notes, "
                + "completed, "
                + "deadLine, "
                + "createdAt, "
                + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        //Estabelecendo a conexão com o banco de dados
        Connection connection = null;

        //Preparando a query
        PreparedStatement statement = null;

        //Setando os valores no statement
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isCompleted());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));   //utilizando o Date do SQL e criando uma nova Date
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));  //que recebe como parâmetro o get das datas e 
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));  //convertendo para o formato 'long' com o get.Time

            //Executando a query
            statement.execute();

        } catch (Exception ex) {                                           //possível saída em caso de erro
            throw new RuntimeException("Erro ao salvar a tarefa"
                    + ex.getMessage(), ex);                                //mostra a mensagem + o erro no sistema

        } finally {                                                        //executa a ação por ultimo
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void update(Tasks task) {

        String sql = "UPDATE tasks SET "
                + "idProject = ?, "
                + "name = ?, "
                + "description = ?, "
                + "notes = ?, "
                + "completed = ?, "
                + "deadLine = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isCompleted());
            statement.setDate(6, new Date(task.getDeadLine().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa"
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            //Setando o valor no filtro de busca (banco SQL -> taskId) 
            statement.setInt(1, taskId);

            //Executando
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa", ex);

        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public List<Tasks> getAll(int idProject) {
        String sql = "SELECT * FROM tasks WHERE idProject = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        //Classe que recupera os dados do banco
        ResultSet resultSet = null;

        //Lista de tarefas desenvolvidas quando o método for chamado 
        List<Tasks> tasksList = new ArrayList<Tasks>();

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            //Setando o valor do filtro de busca
            statement.setInt(1, idProject);

            //Executando a query
            resultSet = statement.executeQuery();

            //Convertendo objetos do banco de dados para objeto da classe tasks
            while (resultSet.next()) {
                Tasks task = new Tasks();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setNotes(resultSet.getString("notes"));
                task.setCompleted(resultSet.getBoolean("completed"));
                task.setDeadLine(resultSet.getDate("deadLine"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));

                //adicionando a tarefa na lista
                tasksList.add(task);
            }

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir a tarefa"
                    + ex.getMessage(), ex);

        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return tasksList;   //lista criada vindo do banco de dados                                    
    }
}
