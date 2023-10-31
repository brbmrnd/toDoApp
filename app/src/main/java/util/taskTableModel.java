package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Tasks;

/**
 *
 * @author Barbara
 */
public class taskTableModel extends AbstractTableModel {

    //vetor de String que correspondem as *colunas* da tabela
    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    //lista que corresponde as tarefas em *linha* na tabela
    List<Tasks> tasks = new ArrayList();

//metodos abstratos nativos da AbstractTable que precisam ser implementados
    @Override
    //quantidade de linhas = quantidade de tarefas
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    //quantidade de colunas = quantidade do vetor columns
    public int getColumnCount() {
        return columns.length;
    }

    @Override //sobrescrita de código implementado
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3; //retorna que apenas na coluna 3 sinaliza 'true'
    }

    @Override
    //retorna o tipo da classe de cada coluna
    public Class<?> getColumnClass(int columnIndex) {
        if (tasks.isEmpty()) {
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }

    @Override
    //corresponde a uma linha em uma coluna específica
    public Object getValueAt(int rowIndex, int columnIndex) {

        //seleciona a linha com base no numero da coluna (informada em case 0, 1, 2, 3, 4 e 5)
        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                //o dateformat recebe uma data e retorna uma String
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadLine());
            case 3:
                return tasks.get(rowIndex).isCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados.";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        tasks.get(rowIndex).setCompleted((boolean) aValue);
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
