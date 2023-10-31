package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Tasks;

public class deadLineColumnCellRenderer extends DefaultTableCellRenderer {
    
    @Override //método retorna  o componente que vai ser renderizando na célula  
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //renderiza o componente
        
        label.setHorizontalAlignment(CENTER); //centraliza o conteudo da célula
       
        taskTableModel taskModel = (taskTableModel) table.getModel(); // selecionando o model
        Tasks task = taskModel.getTasks().get(row); //seleciona a tarefa que está sendo renderizada na linha
        
        if(task.getDeadLine().after(new Date())) { //identifica se a deadline está atrasada ou não
            label.setForeground(Color.GREEN);
        }else {
            label.setForeground(Color.RED);
        }
        
        return label;
    }
}
