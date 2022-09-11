/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author jesse
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTableTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmptyList = new javax.swing.JPanel();
        EmptyListIcon = new javax.swing.JLabel();
        EmptyListTitle = new javax.swing.JLabel();
        EmptyListSubtitle = new javax.swing.JLabel();
        ToolBar = new javax.swing.JPanel();
        ToolBarTitle = new javax.swing.JLabel();
        ToolBarSubtitle = new javax.swing.JLabel();
        Projects = new javax.swing.JPanel();
        ProjectsTitle = new javax.swing.JLabel();
        ProjectsAdd = new javax.swing.JLabel();
        Tasks = new javax.swing.JPanel();
        TasksTitle = new javax.swing.JLabel();
        TasksAdd = new javax.swing.JLabel();
        ProjectList = new javax.swing.JPanel();
        jScrollPane1Projects = new javax.swing.JScrollPane();
        Projecs = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        PanelTasks = new javax.swing.JScrollPane();
        TableTasks = new javax.swing.JTable();

        EmptyList.setBackground(java.awt.Color.white);

        EmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyListIcon.setText("(><)");

        EmptyListTitle.setBackground(new java.awt.Color(51, 51, 255));
        EmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmptyListTitle.setForeground(new java.awt.Color(51, 51, 255));
        EmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyListTitle.setText("Nenhuma tarefa por aqui :D");

        EmptyListSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmptyListSubtitle.setForeground(new java.awt.Color(204, 204, 204));
        EmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyListSubtitle.setText("Clique no bot�o \"ADD\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout EmptyListLayout = new javax.swing.GroupLayout(EmptyList);
        EmptyList.setLayout(EmptyListLayout);
        EmptyListLayout.setHorizontalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmptyListLayout.createSequentialGroup()
                .addGroup(EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmptyListSubtitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EmptyListLayout.setVerticalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyListLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(EmptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmptyListSubtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ToolBar.setBackground(new java.awt.Color(51, 51, 255));

        ToolBarTitle.setBackground(java.awt.Color.white);
        ToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        ToolBarTitle.setForeground(java.awt.Color.white);
        ToolBarTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToolBarTitle.setText("Minhas Tarefas");

        ToolBarSubtitle.setForeground(java.awt.Color.white);
        ToolBarSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToolBarSubtitle.setText("Escreva aqui as suas tarefas, tenha controle de tudo!");

        javax.swing.GroupLayout ToolBarLayout = new javax.swing.GroupLayout(ToolBar);
        ToolBar.setLayout(ToolBarLayout);
        ToolBarLayout.setHorizontalGroup(
            ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolBarSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ToolBarLayout.setVerticalGroup(
            ToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ToolBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToolBarSubtitle)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Projects.setBackground(java.awt.Color.white);
        Projects.setBorder(new javax.swing.border.MatteBorder(null));

        ProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProjectsTitle.setForeground(new java.awt.Color(51, 51, 255));
        ProjectsTitle.setText("Projetos");

        ProjectsAdd.setText("ADD");
        ProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProjectsLayout = new javax.swing.GroupLayout(Projects);
        Projects.setLayout(ProjectsLayout);
        ProjectsLayout.setHorizontalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(ProjectsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ProjectsLayout.setVerticalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tasks.setBackground(java.awt.Color.white);
        Tasks.setBorder(new javax.swing.border.MatteBorder(null));

        TasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TasksTitle.setForeground(new java.awt.Color(51, 51, 255));
        TasksTitle.setText("Tarefas");

        TasksAdd.setText("ADD");

        javax.swing.GroupLayout TasksLayout = new javax.swing.GroupLayout(Tasks);
        Tasks.setLayout(TasksLayout);
        TasksLayout.setHorizontalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TasksLayout.setVerticalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TasksAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ProjectList.setBackground(java.awt.Color.white);
        ProjectList.setBorder(new javax.swing.border.MatteBorder(null));

        Projecs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Projecs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Projecs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Projecs.setFixedCellHeight(50);
        Projecs.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1Projects.setViewportView(Projecs);

        javax.swing.GroupLayout ProjectListLayout = new javax.swing.GroupLayout(ProjectList);
        ProjectList.setLayout(ProjectListLayout);
        ProjectListLayout.setHorizontalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1Projects)
        );
        ProjectListLayout.setVerticalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1Projects)
        );

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

        TableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Tarefa Conclu�da"
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
        TableTasks.setRowHeight(50);
        TableTasks.setSelectionBackground(new java.awt.Color(51, 51, 255));
        TableTasks.setShowGrid(false);
        TableTasks.setShowHorizontalLines(true);
        PanelTasks.setViewportView(TableTasks);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Projects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectsAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPanelCheckingEnabled);
        projectDialogScreen.setVisible(true);

        taskDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            }
        });
    }//GEN-LAST:event_ProjectsAddMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) { //mudei de Nimbus para Java swing
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmptyList;
    private javax.swing.JLabel EmptyListIcon;
    private javax.swing.JLabel EmptyListSubtitle;
    private javax.swing.JLabel EmptyListTitle;
    private javax.swing.JScrollPane PanelTasks;
    private javax.swing.JList<String> Projecs;
    private javax.swing.JPanel ProjectList;
    private javax.swing.JPanel Projects;
    private javax.swing.JLabel ProjectsAdd;
    private javax.swing.JLabel ProjectsTitle;
    private javax.swing.JTable TableTasks;
    private javax.swing.JPanel Tasks;
    private javax.swing.JLabel TasksAdd;
    private javax.swing.JLabel TasksTitle;
    private javax.swing.JPanel ToolBar;
    private javax.swing.JLabel ToolBarSubtitle;
    private javax.swing.JLabel ToolBarTitle;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1Projects;
    // End of variables declaration//GEN-END:variables

    
    public void decorateTableTask(){
        //customizando o header da table de tarefas
        TableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        TableTasks.getTableHeader().setBackground(new Color(51, 51, 255));
        TableTasks.getTableHeader().setForeground(new Color(255, 255, 255));//white
        
        //criando um sort automatico para as colunas da table
        TableTasks.setAutoCreateRowSorter(true);
    }
}
