package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Tasks;
import util.ButtonColumnCellRenderer;
import util.deadLineColumnCellRenderer;
import util.taskTableModel;

public class MainScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;

    //construindo a parte visual do componente (lista de projetos)
    //DefaultListModel = implementação de classe padrão do java p/ models que especifica o que tem na JList Projects
    DefaultListModel projectsModel;
    //TasksTableMOdel implementa o model feito em no package util p/ a Jlist das Tarefas
    taskTableModel tasksModel;

    public MainScreen() {
        initComponents();
        initDataController();
        initComponentsModel();
        decorateTableTask();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelToolbar = new javax.swing.JPanel();
        jLabelToolbarTitle = new javax.swing.JLabel();
        jLabelToolbarSubtitle = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectsTitle = new javax.swing.JLabel();
        jLabelProjectsAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTitle = new javax.swing.JLabel();
        jLabelTasksAdd = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jEmptyListIcon = new javax.swing.JLabel();
        jEmptyListTitle = new javax.swing.JLabel();
        jEmptyListSubtitle = new javax.swing.JLabel();
        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(980, 980));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N

        jPanelToolbar.setBackground(new java.awt.Color(144, 199, 199));

        jLabelToolbarTitle.setFont(new java.awt.Font("World of Water", 0, 48)); // NOI18N
        jLabelToolbarTitle.setForeground(new java.awt.Color(0, 102, 102));
        jLabelToolbarTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\barba\\OneDrive\\Documentos\\NetBeansProjects\\toDoApp\\app\\src\\main\\icons\\accept.png")); // NOI18N
        jLabelToolbarTitle.setText(" toDo");

        jLabelToolbarSubtitle.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabelToolbarSubtitle.setForeground(new java.awt.Color(0, 102, 102));
        jLabelToolbarSubtitle.setText("anote tudo, não esqueça nada");

        javax.swing.GroupLayout jPanelToolbarLayout = new javax.swing.GroupLayout(jPanelToolbar);
        jPanelToolbar.setLayout(jPanelToolbarLayout);
        jPanelToolbarLayout.setHorizontalGroup(
            jPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolbarLayout.createSequentialGroup()
                .addGroup(jPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelToolbarLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelToolbarSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelToolbarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelToolbarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelToolbarLayout.setVerticalGroup(
            jPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolbarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelToolbarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelToolbarSubtitle)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectsTitle.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabelProjectsTitle.setForeground(new java.awt.Color(0, 153, 153));
        jLabelProjectsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProjectsTitle.setText("  Projetos");

        jLabelProjectsAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProjectsAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\barba\\OneDrive\\Documentos\\NetBeansProjects\\toDoApp\\app\\src\\main\\icons\\plus.png")); // NOI18N
        jLabelProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProjectsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addComponent(jLabelProjectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTasksTitle.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabelTasksTitle.setForeground(new java.awt.Color(0, 153, 153));
        jLabelTasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTasksTitle.setText("  Tarefas");

        jLabelTasksAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTasksAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\barba\\OneDrive\\Documentos\\NetBeansProjects\\toDoApp\\app\\src\\main\\icons\\add.png")); // NOI18N
        jLabelTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTasksAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelProjectList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProjects.setBorder(null);
        jListProjects.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setToolTipText("Selecione um projeto");
        jListProjects.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListProjects.setFixedCellHeight(40);
        jListProjects.setSelectionBackground(new java.awt.Color(180, 217, 217));
        jListProjects.setSelectionForeground(new java.awt.Color(0, 153, 153));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmptyList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archive.png"))); // NOI18N

        jEmptyListTitle.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEmptyListTitle.setText("Ufa! Nenhuma tarefa por aqui :D");

        jEmptyListSubtitle.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jEmptyListSubtitle.setForeground(new java.awt.Color(170, 170, 170));
        jEmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEmptyListSubtitle.setText("Clique no ícone '+' para adicionar uma nova tarefa");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jEmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                    .addComponent(jEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jEmptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmptyListSubtitle)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        jTableTasks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableTasks.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jTableTasks.setForeground(new java.awt.Color(0, 0, 0));
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(30);
        jTableTasks.setSelectionBackground(new java.awt.Color(144, 199, 199));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowGrid(false);
        jTableTasks.setUpdateSelectionOnSort(false);
        jTableTasks.setVerifyInputWhenFocusTarget(false);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        jPanel1.add(jScrollPaneTasks, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanelToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectsAddMouseClicked
        // linkando a caixa de diálogo Projets ao evento de click
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);

        //adicionar um "listener" para carregar lista de projetos a partir do evento de fechar a janela de cadastro de projetos
        projectDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });
    }//GEN-LAST:event_jLabelProjectsAddMouseClicked

    private void jLabelTasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTasksAddMouseClicked
        // linkando a caixa de diálogo Tasks ao evento de click
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);

        //vincula a tarefa criada ao projeto selecionado
        int projectIndex = jListProjects.getSelectedIndex(); //retorna o índice do projeto selecionado
        Project project = (Project) projectsModel.get(projectIndex); //seleciona o projeto Index no model

        taskDialogScreen.setProject(project);

        //deixa a caixa visível
        taskDialogScreen.setVisible(true);

        /*adicionar um "listener" para carregar lista de tasks do projeto selecionado
        a partir do evento de fechar a janela de cadastro de tarefas */
        taskDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            }
        });

    }//GEN-LAST:event_jLabelTasksAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // identifica o ponto (coordenadas) em que o click ocorreu
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint()); //coordenada da linha 
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint()); //coordenada da coluna

        //recortou a variável de dentro do switch e declarou como variável local
        Tasks task = tasksModel.getTasks().get(rowIndex); //cria um objeto task que repreenta a tarefa clicada dentro da lista

        //vincula a coluna que recebeu o click com uma ação
        switch (columnIndex) {
            case 3:
                taskController.update(task); //chama o método de atualizar essa tarefa
                break;
            case 4:

                break;
            case 5:
                taskController.removeById(task.getId());  //exclui a tarefa selecionada
                //atualizando a lista de tarefas dentro do projeto
                int projectIndex = jListProjects.getSelectedIndex(); //identifica o índice do projeto selecionado
                Project project = (Project) projectsModel.get(projectIndex); //pega o projeto selecionado
                loadTasks(project.getId()); //carrega todas as tarefas dele
                break;
        }

    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        // TODO add your handling code here:
        int projectIndex = jListProjects.getSelectedIndex(); //identifica o índice do projeto clicado
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
    }//GEN-LAST:event_jListProjectsMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jEmptyListIcon;
    private javax.swing.JLabel jEmptyListSubtitle;
    private javax.swing.JLabel jEmptyListTitle;
    private javax.swing.JLabel jLabelProjectsAdd;
    private javax.swing.JLabel jLabelProjectsTitle;
    private javax.swing.JLabel jLabelTasksAdd;
    private javax.swing.JLabel jLabelTasksTitle;
    private javax.swing.JLabel jLabelToolbarSubtitle;
    private javax.swing.JLabel jLabelToolbarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelToolbar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    public final void decorateTableTask() {
        //customizando o header
        jTableTasks.getTableHeader().setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0, 102, 102));
        jTableTasks.getTableHeader().setForeground(Color.white);

        //criando um sort para as colunas
        jTableTasks.setAutoCreateRowSorter(true);

        //adicionando o render da coluna Deadline
        jTableTasks.getColumnModel().getColumn(2) //seleciona a coluna
                .setCellRenderer(new deadLineColumnCellRenderer());     //seleciona o render pra coluna
        
        //adicionando o render da coluna Editar
        jTableTasks.getColumnModel().getColumn(4)
                .setCellRenderer(new ButtonColumnCellRenderer("edit"));
        
        //adicionando o render da coluna Excluir
        jTableTasks.getColumnModel().getColumn(5)
                .setCellRenderer(new ButtonColumnCellRenderer("delete"));
        
    }

    //metodo de inicialização dos controladores
    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }

    //instanciando os modelos de JLst e JTable e configurando inicializações
    public void initComponentsModel() {
        projectsModel = new DefaultListModel(); //aplicando o modelo da Jlist
        loadProjects(); //carrego os projetos

        tasksModel = new taskTableModel();
        jTableTasks.setModel(tasksModel); //aplicando model na JTable

        if (!projectsModel.isEmpty()) {
            jListProjects.setSelectedIndex(0); //selecionar sempre o primeiro projeto da lista 
            Project project = (Project) projectsModel.get(0); //seleciono o primeiro projeto no model
            loadTasks(project.getId()); // carrego as tarefas do primeiro projeto da lista

        }
    }

    //carregar as tarefas para dentro da TableModel
    public void loadTasks(int idProject) {
        List<Tasks> tasks = taskController.getAll(idProject); //carrega todas as tarefas de acordo com a idProject informada

        //foi preciso criar os getters and setters na taskTableModel
        tasksModel.setTasks(tasks); //seta as tarefas carregadas do BD no taskmodel 

        showJTableTasks(!tasks.isEmpty()); //método inicializa se a lista não estiver vazia

    }

    private void showJTableTasks(boolean hasTasks) {
        if (hasTasks) {
            //se houver tarefas, remover a tela de lista vazia
            if (jPanelEmptyList.isVisible()) {
                jPanelEmptyList.setVisible(false);
                jPanel1.remove(jPanelEmptyList);
            }
            //e adiciona a tabela com as tarefas
            jPanel1.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanel1.getWidth(), jPanel1.getHeight()); //ajusta as dimensões do painel

        } else {
            //se não houver tarefas faz o processo inverso
            if (jScrollPaneTasks.isVisible()) {
                jScrollPaneTasks.setVisible(false);
                jPanel1.remove(jScrollPaneTasks);
            }

            jPanel1.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanel1.getWidth(), jPanel1.getHeight()); //ajusta as dimensões do painel
        }
    }

    //carregar os dados para dentro da JList
    public void loadProjects() {
        List<Project> projects = projectController.getAll();

        //limpa os dados residuais
        projectsModel.clear();

        //recarrega os projetos armazenados
        for (int i = 0; i < projects.size(); i++) {
            Project project = projects.get(i);
            projectsModel.addElement(project);

            /* nesse ponto, voltamos ao project class, para modificar o método toString(), colocando apenas o nome do projeto 
       para ser exibido na interface */
        }
        //vincula o JList com o model criado
        jListProjects.setModel(projectsModel); //aplicando model na Jlist projetos

    }

}
