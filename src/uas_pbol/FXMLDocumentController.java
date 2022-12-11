/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package uas_pbol;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Yudi Tan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<TableModel> table;
    @FXML
    private TableColumn<TableModel, String> col_nama;
    @FXML
    private TableColumn<TableModel, String> col_umur;
    @FXML
    private TableColumn<TableModel, String> col_gender;
    @FXML
    private TableColumn<TableModel, String> col_kulit;
    @FXML
    private TableColumn<TableModel, String> col_mata;
    @FXML
    private TableColumn<TableModel, String> col_tinggi;
    @FXML
    private TableColumn<TableModel, String> col_rambut;
    
    ObservableList<TableModel> oblist = FXCollections.observableArrayList();
    @FXML
    private CheckBox check_putih;
    @FXML
    private CheckBox check_biru;
    @FXML
    private CheckBox check_hitam;
    @FXML
    private CheckBox check_coklat;
    @FXML
    private CheckBox check_hijau;
    @FXML
    private CheckBox check_pendek;
    @FXML
    private CheckBox check_panjang;
   
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        check_putih.setOnAction(event -> filterData());
        check_biru.setOnAction(event -> filterData());
        check_hitam.setOnAction(event -> filterData());
        check_coklat.setOnAction(event -> filterData());
        check_hijau.setOnAction(event -> filterData());
        check_pendek.setOnAction(event -> filterData());
        check_panjang.setOnAction(event -> filterData());
        
        
        try {
            Connection con=DBConnector.getConnection();
            
            ResultSet rs;
            rs = con.createStatement().executeQuery("select * from person");
            
           while (rs.next()){
                oblist.add(new TableModel(rs.getString("Nama"),rs.getString("Umur"),rs.getString("Gender"),rs.getString("Kulit")
                ,rs.getString("Mata"),rs.getString("Tinggi"),rs.getString("Rambut")));
           }
        }catch(SQLException ex){
            
         
        }
        
        
        
        
       col_nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
       col_umur.setCellValueFactory(new PropertyValueFactory<>("umur"));
       col_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
       col_kulit.setCellValueFactory(new PropertyValueFactory<>("kulit"));
       col_mata.setCellValueFactory(new PropertyValueFactory<>("mata"));
       col_tinggi.setCellValueFactory(new PropertyValueFactory<>("tinggi"));
       col_rambut.setCellValueFactory(new PropertyValueFactory<>("rambut"));
       
       table.setItems(oblist);
       
    }
    
    public void filterData() {
    ObservableList<TableModel> filteredData = FXCollections.observableArrayList();
        
    for (TableModel item : table.getItems()) {
        if (check_putih.isSelected() && item.getKulit().equals("Putih")) {
            filteredData.add(item);
        }
        if (check_hitam.isSelected() && item.getKulit().equals("Hitam")) {
            filteredData.add(item);
        }
        if (check_biru.isSelected() && item.getMata().equals("Biru")) {
            filteredData.add(item);
        }
        if (check_coklat.isSelected() && item.getMata().equals("Coklat")) {
            filteredData.add(item);
        }
        if (check_hijau.isSelected() && item.getMata().equals("Hijau")) {
            filteredData.add(item);
        }
        if (check_panjang.isSelected() && item.getRambut().equals("Panjang")) {
            filteredData.add(item);
        }
        if (check_pendek.isSelected() && item.getRambut().equals("Pendek")) {
            filteredData.add(item);
        }
    }
        
    table.setItems(filteredData);
}

}