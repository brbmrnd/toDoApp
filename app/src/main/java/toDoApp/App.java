package toDoApp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import model.Project;
import model.Tasks;
import util.ConnectionFactory;

public class App {

    public static void main(String[] args) throws SQLException {
        //toDo code application logic

        /* Project Controllers TESTING 
        ProjectController projectControl = new ProjectController();
        Project project = new Project();
        project.setId(3);
        project.setName("Projeto teste update");
        project.setDescription("Updating");
        projectControl.update(project);

        List<Project> projects = projectControl.getAll();
        System.out.println("O total de projetos é = " + projects.size());

//      Task Controllers TESTING
        TaskController taskControl = new TaskController();
        Tasks task = new Tasks();
        task.setId(3);
        task.setIdProject(3);
        task.setName("task updated");
        task.setDescription("testing task");
        task.setNotes("testing notes");
        taskControl.update(task);

        List<Tasks> tasks = taskControl.getAll(1);
        System.out.println("O total de tarefas é = " + tasks.size());*/

        //Establishing DB connection
        Connection connect = ConnectionFactory.getConnection();
        ConnectionFactory.closeConnection(connect);
    }

}
