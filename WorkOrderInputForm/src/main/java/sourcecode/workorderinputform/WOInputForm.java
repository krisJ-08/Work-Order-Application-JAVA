/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcecode.workorderinputform;

import org.hsqldb.DatabaseType;
import org.hsqldb.lib.HsqlArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;


/**
 * @author Kristian
 */
public class WOInputForm extends javax.swing.JFrame {

    static Connection objConn;

    private String SchedTime;
    private double dblMatPrice1;
    private double dblMatPrice2;
    private double dblMatPrice3;
    private double dblMatPrice4;
    private double dblAmount1;
    private double dblAmount2;
    private double dblAmount3;
    private double dblAmount4;
    private double dblTotalLaborInit;
    private double dblLaborPrice1;
    private double dblLaborPrice2;
    private double dblLaborPrice3;
    private int qty4;
    private int qty1;
    private int qty2;
    private int qty3;
    private int hrs1;
    private int hrs2;
    private int hrs3;
    private int MachineNo;
    private String sqlWOID;
    private double dblTotalMaterials;
    private double dblTotal;
    private String txtTakenBy;
    private String txtRequestedBy;
    private String txtChargeTo;
    private String txtDept;
    private String txtBldgfloor;
    private String txtTimeSched;
    private String txtWrkCompBy;
    private String txtInsAppBy;
    private String txtdateofcreation;
    private String txtDateWanted;
    private String txtScheduleDate;
    private String txtDateComp;
    private String txtDateInsp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnOkError;
    private javax.swing.JButton bttnSave;
    private javax.swing.ButtonGroup bttngrpDesc1;
    private javax.swing.ButtonGroup bttngrpDesc2;
    private javax.swing.ButtonGroup bttngrpDesc3;
    private javax.swing.ButtonGroup bttngrpDesc4;
    private javax.swing.ButtonGroup bttngrpDesc5;
    private javax.swing.ButtonGroup bttngrpDesc6;
    private javax.swing.ButtonGroup bttngrpDesc7;
    private javax.swing.ButtonGroup bttngrpScheduledTime;
    private javax.swing.ButtonGroup bttngrpTimeCreation;
    private javax.swing.JCheckBox chckbox_Main1;
    private javax.swing.JCheckBox chckbox_Main2;
    private javax.swing.JCheckBox chckbox_Main3;
    private javax.swing.JCheckBox chckbox_Main4;
    private javax.swing.JCheckBox chckbox_Main5;
    private javax.swing.JCheckBox chckbox_Main6;
    private javax.swing.JCheckBox chckbox_Main7;
    private javax.swing.JCheckBox chckbox_Rep1;
    private javax.swing.JCheckBox chckbox_Rep2;
    private javax.swing.JCheckBox chckbox_Rep3;
    private javax.swing.JCheckBox chckbox_Rep4;
    private javax.swing.JCheckBox chckbox_Rep5;
    private javax.swing.JCheckBox chckbox_Rep6;
    private javax.swing.JCheckBox chckbox_Rep7;
    private javax.swing.JCheckBox chckbox_SchedCreationAm;
    private javax.swing.JCheckBox chckbox_SchedCreationPM;
    private javax.swing.JCheckBox chckbox_TimeCreationAm;
    private javax.swing.JDialog frameErrorMessage;
    private javax.swing.JCheckBox hckbox_TimeCreationPm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtfld_Amount1;
    private javax.swing.JFormattedTextField txtfld_Amount2;
    private javax.swing.JFormattedTextField txtfld_Amount3;
    private javax.swing.JFormattedTextField txtfld_Amount4;
    private javax.swing.JFormattedTextField txtfld_ChargeTo;
    private javax.swing.JFormattedTextField txtfld_DateComp;
    private javax.swing.JFormattedTextField txtfld_DateInsp;
    private javax.swing.JFormattedTextField txtfld_DateWanted;
    private javax.swing.JFormattedTextField txtfld_Dept;
    private javax.swing.JFormattedTextField txtfld_Descrption1;
    private javax.swing.JFormattedTextField txtfld_Descrption2;
    private javax.swing.JFormattedTextField txtfld_Descrption3;
    private javax.swing.JFormattedTextField txtfld_Descrption4;
    private javax.swing.JFormattedTextField txtfld_Descrption5;
    private javax.swing.JFormattedTextField txtfld_Descrption6;
    private javax.swing.JFormattedTextField txtfld_Descrption7;
    private javax.swing.JFormattedTextField txtfld_InspAppBy;
    private javax.swing.JFormattedTextField txtfld_Labor1;
    private javax.swing.JFormattedTextField txtfld_Labor2;
    private javax.swing.JFormattedTextField txtfld_Labor3;
    private javax.swing.JFormattedTextField txtfld_LbrPrice1;
    private javax.swing.JFormattedTextField txtfld_LbrPrice2;
    private javax.swing.JFormattedTextField txtfld_LbrPrice3;
    private javax.swing.JFormattedTextField txtfld_MachineNo;
    private javax.swing.JFormattedTextField txtfld_MatPrice1;
    private javax.swing.JFormattedTextField txtfld_MatPrice2;
    private javax.swing.JFormattedTextField txtfld_MatPrice3;
    private javax.swing.JFormattedTextField txtfld_MatPrice4;
    private javax.swing.JFormattedTextField txtfld_MaterialsParts1;
    private javax.swing.JFormattedTextField txtfld_MaterialsParts2;
    private javax.swing.JFormattedTextField txtfld_MaterialsParts3;
    private javax.swing.JFormattedTextField txtfld_MaterialsParts4;
    private javax.swing.JFormattedTextField txtfld_Requestedby;
    private javax.swing.JFormattedTextField txtfld_ScheduledDate;
    private javax.swing.JFormattedTextField txtfld_TOTAL;
    private javax.swing.JFormattedTextField txtfld_Takenby;
    private javax.swing.JFormattedTextField txtfld_Time;
    private javax.swing.JFormattedTextField txtfld_TimeSched;
    private javax.swing.JFormattedTextField txtfld_TotalLaborInit;
    private javax.swing.JFormattedTextField txtfld_TotalLbr;
    private javax.swing.JFormattedTextField txtfld_TotalMat;
    private javax.swing.JFormattedTextField txtfld_WrkCompBy;
    private javax.swing.JFormattedTextField txtfld_bldgfloor1;
    private javax.swing.JFormattedTextField txtfld_dateofcreation;
    private javax.swing.JFormattedTextField txtfld_hrs1;
    private javax.swing.JFormattedTextField txtfld_hrs2;
    private javax.swing.JFormattedTextField txtfld_hrs3;
    private javax.swing.JFormattedTextField txtfld_qty1;
    private javax.swing.JFormattedTextField txtfld_qty2;
    private javax.swing.JFormattedTextField txtfld_qty3;
    private javax.swing.JFormattedTextField txtfld_qty4;
    /**
     * Creates new form WOInputForm
     */
    public WOInputForm() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WOInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WOInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WOInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WOInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WOInputForm().setVisible(true);
            }
        });

        try {
            objConn = DriverManager.getConnection("jdbc:ucanaccess://D:\\Files\\Documents\\PUPDocs\\InfoMngmt\\Project\\IT Work Order Input Form\\Work-Order-Application-JAVA\\WorkOrderInputForm\\src\\main\\java\\sourcecode\\workorderinputform\\WODatabase Sample.accdb");
            System.out.println("Database Connected");
        } catch (Exception objEx) {

            System.out.println("Database failed!");
            System.out.println(objEx);

        } finally {
            if (objConn != null) {
                try {
                    objConn.close();
                } catch (Exception objEx) {
                    System.out.println("Problem closing the database!");
                    System.out.println(objEx);
                }
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttngrpTimeCreation = new javax.swing.ButtonGroup();
        bttngrpScheduledTime = new javax.swing.ButtonGroup();
        bttngrpDesc1 = new javax.swing.ButtonGroup();
        bttngrpDesc2 = new javax.swing.ButtonGroup();
        bttngrpDesc3 = new javax.swing.ButtonGroup();
        bttngrpDesc4 = new javax.swing.ButtonGroup();
        bttngrpDesc5 = new javax.swing.ButtonGroup();
        bttngrpDesc6 = new javax.swing.ButtonGroup();
        bttngrpDesc7 = new javax.swing.ButtonGroup();
        frameErrorMessage = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        bttnOkError = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfld_dateofcreation = new javax.swing.JFormattedTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtfld_Time = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        hckbox_TimeCreationPm = new javax.swing.JCheckBox();
        chckbox_TimeCreationAm = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtfld_Takenby = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtfld_Requestedby = new javax.swing.JFormattedTextField();
        jLabel47 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtfld_Dept = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtfld_bldgfloor1 = new javax.swing.JFormattedTextField();
        jLabel50 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtfld_MachineNo = new javax.swing.JFormattedTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtfld_DateWanted = new javax.swing.JFormattedTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        chckbox_Rep1 = new javax.swing.JCheckBox();
        chckbox_Main1 = new javax.swing.JCheckBox();
        txtfld_Descrption1 = new javax.swing.JFormattedTextField();
        jPanel14 = new javax.swing.JPanel();
        chckbox_Rep2 = new javax.swing.JCheckBox();
        chckbox_Main2 = new javax.swing.JCheckBox();
        txtfld_Descrption2 = new javax.swing.JFormattedTextField();
        jPanel15 = new javax.swing.JPanel();
        chckbox_Rep3 = new javax.swing.JCheckBox();
        chckbox_Main3 = new javax.swing.JCheckBox();
        txtfld_Descrption3 = new javax.swing.JFormattedTextField();
        jPanel16 = new javax.swing.JPanel();
        chckbox_Rep4 = new javax.swing.JCheckBox();
        chckbox_Main4 = new javax.swing.JCheckBox();
        txtfld_Descrption4 = new javax.swing.JFormattedTextField();
        jPanel17 = new javax.swing.JPanel();
        chckbox_Rep5 = new javax.swing.JCheckBox();
        chckbox_Main5 = new javax.swing.JCheckBox();
        txtfld_Descrption5 = new javax.swing.JFormattedTextField();
        jPanel18 = new javax.swing.JPanel();
        chckbox_Rep6 = new javax.swing.JCheckBox();
        chckbox_Main6 = new javax.swing.JCheckBox();
        txtfld_Descrption6 = new javax.swing.JFormattedTextField();
        jPanel19 = new javax.swing.JPanel();
        chckbox_Rep7 = new javax.swing.JCheckBox();
        chckbox_Main7 = new javax.swing.JCheckBox();
        txtfld_Descrption7 = new javax.swing.JFormattedTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtfld_ScheduledDate = new javax.swing.JFormattedTextField();
        jLabel53 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        chckbox_SchedCreationAm = new javax.swing.JCheckBox();
        chckbox_SchedCreationPM = new javax.swing.JCheckBox();
        txtfld_TimeSched = new javax.swing.JFormattedTextField();
        jLabel54 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        txtfld_qty1 = new javax.swing.JFormattedTextField();
        jPanel27 = new javax.swing.JPanel();
        txtfld_MaterialsParts1 = new javax.swing.JFormattedTextField();
        jPanel28 = new javax.swing.JPanel();
        txtfld_MatPrice1 = new javax.swing.JFormattedTextField();
        jPanel29 = new javax.swing.JPanel();
        txtfld_Amount1 = new javax.swing.JFormattedTextField();
        jPanel30 = new javax.swing.JPanel();
        txtfld_qty2 = new javax.swing.JFormattedTextField();
        jPanel31 = new javax.swing.JPanel();
        txtfld_MaterialsParts2 = new javax.swing.JFormattedTextField();
        jPanel32 = new javax.swing.JPanel();
        txtfld_MatPrice2 = new javax.swing.JFormattedTextField();
        jPanel33 = new javax.swing.JPanel();
        txtfld_Amount2 = new javax.swing.JFormattedTextField();
        jPanel34 = new javax.swing.JPanel();
        txtfld_qty3 = new javax.swing.JFormattedTextField();
        jPanel35 = new javax.swing.JPanel();
        txtfld_MaterialsParts3 = new javax.swing.JFormattedTextField();
        jPanel36 = new javax.swing.JPanel();
        txtfld_MatPrice3 = new javax.swing.JFormattedTextField();
        jPanel37 = new javax.swing.JPanel();
        txtfld_Amount3 = new javax.swing.JFormattedTextField();
        jPanel38 = new javax.swing.JPanel();
        txtfld_qty4 = new javax.swing.JFormattedTextField();
        jPanel39 = new javax.swing.JPanel();
        txtfld_MaterialsParts4 = new javax.swing.JFormattedTextField();
        jPanel40 = new javax.swing.JPanel();
        txtfld_MatPrice4 = new javax.swing.JFormattedTextField();
        jPanel41 = new javax.swing.JPanel();
        txtfld_Amount4 = new javax.swing.JFormattedTextField();
        jPanel42 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtfld_TotalMat = new javax.swing.JFormattedTextField();
        jPanel45 = new javax.swing.JPanel();
        txtfld_hrs1 = new javax.swing.JFormattedTextField();
        jPanel46 = new javax.swing.JPanel();
        txtfld_Labor1 = new javax.swing.JFormattedTextField();
        jPanel49 = new javax.swing.JPanel();
        txtfld_LbrPrice1 = new javax.swing.JFormattedTextField();
        jPanel50 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtfld_TotalLbr = new javax.swing.JFormattedTextField();
        jPanel52 = new javax.swing.JPanel();
        txtfld_hrs2 = new javax.swing.JFormattedTextField();
        jPanel53 = new javax.swing.JPanel();
        txtfld_Labor2 = new javax.swing.JFormattedTextField();
        jPanel54 = new javax.swing.JPanel();
        txtfld_LbrPrice2 = new javax.swing.JFormattedTextField();
        jPanel55 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        txtfld_hrs3 = new javax.swing.JFormattedTextField();
        jPanel58 = new javax.swing.JPanel();
        txtfld_Labor3 = new javax.swing.JFormattedTextField();
        jPanel59 = new javax.swing.JPanel();
        txtfld_LbrPrice3 = new javax.swing.JFormattedTextField();
        jPanel60 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        txtfld_TotalLaborInit = new javax.swing.JFormattedTextField();
        jPanel64 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtfld_ChargeTo = new javax.swing.JFormattedTextField();
        jLabel62 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtfld_WrkCompBy = new javax.swing.JFormattedTextField();
        jLabel63 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtfld_DateComp = new javax.swing.JFormattedTextField();
        jLabel64 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtfld_TOTAL = new javax.swing.JFormattedTextField();
        jPanel73 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtfld_InspAppBy = new javax.swing.JFormattedTextField();
        jLabel66 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtfld_DateInsp = new javax.swing.JFormattedTextField();
        jLabel67 = new javax.swing.JLabel();
        bttnSave = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();

        frameErrorMessage.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frameErrorMessage.setTitle("Error");
        frameErrorMessage.setAlwaysOnTop(true);
        frameErrorMessage.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        frameErrorMessage.setResizable(false);
        frameErrorMessage.setSize(new java.awt.Dimension(325, 150));
        frameErrorMessage.setType(java.awt.Window.Type.POPUP);

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Please fill up all required labels!");

        bttnOkError.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        bttnOkError.setText("OK");
        bttnOkError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnOkErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameErrorMessageLayout = new javax.swing.GroupLayout(frameErrorMessage.getContentPane());
        frameErrorMessage.getContentPane().setLayout(frameErrorMessageLayout);
        frameErrorMessageLayout.setHorizontalGroup(
                frameErrorMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameErrorMessageLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnOkError)
                                .addGap(35, 35, 35))
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );
        frameErrorMessageLayout.setVerticalGroup(
                frameErrorMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameErrorMessageLayout.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addGap(31, 31, 31)
                                .addComponent(bttnOkError)
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Work Order Input Form");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(700, 600));
        setName("woinputFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(715, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(715, 600));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(700, 600));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 1620));

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 1620));

        jLabel33.setFont(new java.awt.Font("Montserrat SemiBold", 0, 36)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("MAINTENANCE WORK ORDER");

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("INFORMATION TECHNOLOGY DEPARTMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(42, 42, 42)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel40)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 72));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 0));

        jPanel5.setBackground(new java.awt.Color(246, 246, 246));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(220, 65));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setText("Date");

        txtfld_dateofcreation.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/y"))));
        txtfld_dateofcreation.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_dateofcreation.setName("txtfld_dateofcreation"); // NOI18N

        jLabel43.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 0, 0));
        jLabel43.setText("*");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtfld_dateofcreation)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel43))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_dateofcreation, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        txtfld_dateofcreation.getAccessibleContext().setAccessibleName("txtfld_dateofcreation");

        jPanel4.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(246, 246, 246));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(220, 65));

        txtfld_Time.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h:mm"))));
        txtfld_Time.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Time.setName("txtfld_Time"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setText("Time");

        hckbox_TimeCreationPm.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpTimeCreation.add(hckbox_TimeCreationPm);
        hckbox_TimeCreationPm.setFont(new java.awt.Font("Montserrat Light", 0, 10)); // NOI18N
        hckbox_TimeCreationPm.setText("PM");
        hckbox_TimeCreationPm.setName("hckbox_TimeCreationPm"); // NOI18N

        chckbox_TimeCreationAm.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpTimeCreation.add(chckbox_TimeCreationAm);
        chckbox_TimeCreationAm.setFont(new java.awt.Font("Montserrat Light", 0, 10)); // NOI18N
        chckbox_TimeCreationAm.setText("AM");
        chckbox_TimeCreationAm.setName("chckbox_TimeCreationAm"); // NOI18N

        jLabel44.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 0, 0));
        jLabel44.setText("*");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(chckbox_TimeCreationAm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hckbox_TimeCreationPm)
                                .addContainerGap())
                        .addComponent(txtfld_Time, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(hckbox_TimeCreationPm)
                                                .addComponent(chckbox_TimeCreationAm)
                                                .addComponent(jLabel44)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfld_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jPanel4.add(jPanel6);

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 65));

        txtfld_Takenby.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Takenby.setName("txtfld_Takenby"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setText("Taken By");

        jLabel45.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 0, 0));
        jLabel45.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(117, Short.MAX_VALUE))
                        .addComponent(txtfld_Takenby, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel45)
                                                .addGap(10, 10, 10)))
                                .addComponent(txtfld_Takenby, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
        );

        jPanel4.add(jPanel1);

        jPanel7.setBackground(new java.awt.Color(246, 246, 246));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(440, 65));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setText("Requested By");

        txtfld_Requestedby.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Requestedby.setName("txtfld_Requestedby"); // NOI18N

        jLabel47.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 0, 0));
        jLabel47.setText("*");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtfld_Requestedby)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel47))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_Requestedby, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(246, 246, 246));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(220, 65));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel5.setText("Dept");

        txtfld_Dept.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Dept.setName("txtfld_Dept"); // NOI18N

        jLabel49.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 0, 0));
        jLabel49.setText("*");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(148, Short.MAX_VALUE))
                        .addComponent(txtfld_Dept)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel49))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfld_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(246, 246, 246));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(220, 65));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel6.setText("BLDG / Floor");

        txtfld_bldgfloor1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_bldgfloor1.setName("txtfld_bldg/floor1"); // NOI18N

        jLabel50.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 0, 0));
        jLabel50.setText("*");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
                        .addComponent(txtfld_bldgfloor1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel50))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_bldgfloor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(246, 246, 246));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setPreferredSize(new java.awt.Dimension(220, 65));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel7.setText("Machine No.");

        txtfld_MachineNo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MachineNo.setName("txtfld_MachineNo"); // NOI18N

        jLabel48.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 0, 0));
        jLabel48.setText("*");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtfld_MachineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel48))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_MachineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(246, 246, 246));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setPreferredSize(new java.awt.Dimension(220, 65));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel8.setText("Date Wanted");

        txtfld_DateWanted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/y"))));
        txtfld_DateWanted.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_DateWanted.setName("txtfld_DateWanted"); // NOI18N

        jLabel51.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 0, 0));
        jLabel51.setText("*");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(90, Short.MAX_VALUE))
                        .addComponent(txtfld_DateWanted, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_DateWanted, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(234, 234, 234));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(660, 35));

        jLabel9.setBackground(new java.awt.Color(234, 234, 234));
        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DESCRIPTION OF WORK REQUIRED");

        jLabel52.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 0, 0));
        jLabel52.setText("*");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap(206, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179))
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(246, 246, 246));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setPreferredSize(new java.awt.Dimension(660, 70));

        chckbox_Rep1.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc1.add(chckbox_Rep1);
        chckbox_Rep1.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Rep1.setText("Repair");

        chckbox_Main1.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc1.add(chckbox_Main1);
        chckbox_Main1.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Main1.setText("Maintenance");

        txtfld_Descrption1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Descrption1.setName("txtfld_Descrption1"); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chckbox_Main1)
                                        .addComponent(chckbox_Rep1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfld_Descrption1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfld_Descrption1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                                .addComponent(chckbox_Main1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chckbox_Rep1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(246, 246, 246));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setPreferredSize(new java.awt.Dimension(660, 70));

        chckbox_Rep2.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc2.add(chckbox_Rep2);
        chckbox_Rep2.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Rep2.setText("Repair");

        chckbox_Main2.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc2.add(chckbox_Main2);
        chckbox_Main2.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Main2.setText("Maintenance");

        txtfld_Descrption2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Descrption2.setName("txtfld_Descrption2"); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chckbox_Main2)
                                        .addComponent(chckbox_Rep2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfld_Descrption2)
                                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfld_Descrption2)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                                .addComponent(chckbox_Main2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chckbox_Rep2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(246, 246, 246));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setPreferredSize(new java.awt.Dimension(660, 70));

        chckbox_Rep3.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc3.add(chckbox_Rep3);
        chckbox_Rep3.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Rep3.setText("Repair");

        chckbox_Main3.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc3.add(chckbox_Main3);
        chckbox_Main3.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Main3.setText("Maintenance");

        txtfld_Descrption3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Descrption3.setName("txtfld_Descrption3"); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chckbox_Main3)
                                        .addComponent(chckbox_Rep3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfld_Descrption3)
                                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfld_Descrption3)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(chckbox_Main3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chckbox_Rep3)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(246, 246, 246));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setPreferredSize(new java.awt.Dimension(660, 70));

        chckbox_Rep4.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc4.add(chckbox_Rep4);
        chckbox_Rep4.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Rep4.setText("Repair");

        chckbox_Main4.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc4.add(chckbox_Main4);
        chckbox_Main4.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Main4.setText("Maintenance");

        txtfld_Descrption4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Descrption4.setName("txtfld_Descrption4"); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chckbox_Main4)
                                        .addComponent(chckbox_Rep4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfld_Descrption4)
                                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfld_Descrption4)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                                .addComponent(chckbox_Main4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chckbox_Rep4)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(246, 246, 246));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setPreferredSize(new java.awt.Dimension(660, 70));

        chckbox_Rep5.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc5.add(chckbox_Rep5);
        chckbox_Rep5.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Rep5.setText("Repair");

        chckbox_Main5.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc5.add(chckbox_Main5);
        chckbox_Main5.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Main5.setText("Maintenance");

        txtfld_Descrption5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Descrption5.setName("txtfld_Descrption5"); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chckbox_Main5)
                                        .addComponent(chckbox_Rep5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfld_Descrption5)
                                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfld_Descrption5)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                                .addComponent(chckbox_Main5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chckbox_Rep5)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(246, 246, 246));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setPreferredSize(new java.awt.Dimension(660, 70));

        chckbox_Rep6.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc6.add(chckbox_Rep6);
        chckbox_Rep6.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Rep6.setText("Repair");

        chckbox_Main6.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc6.add(chckbox_Main6);
        chckbox_Main6.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Main6.setText("Maintenance");

        txtfld_Descrption6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Descrption6.setName("txtfld_Descrption6"); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chckbox_Main6)
                                        .addComponent(chckbox_Rep6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfld_Descrption6)
                                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfld_Descrption6)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                                .addComponent(chckbox_Main6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chckbox_Rep6)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(246, 246, 246));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setPreferredSize(new java.awt.Dimension(660, 70));

        chckbox_Rep7.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc7.add(chckbox_Rep7);
        chckbox_Rep7.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Rep7.setText("Repair");

        chckbox_Main7.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpDesc7.add(chckbox_Main7);
        chckbox_Main7.setFont(new java.awt.Font("Montserrat Light", 0, 12)); // NOI18N
        chckbox_Main7.setText("Maintenance");

        txtfld_Descrption7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Descrption7.setName("txtfld_Descrption7"); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chckbox_Main7)
                                        .addComponent(chckbox_Rep7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfld_Descrption7)
                                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfld_Descrption7)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                                                .addComponent(chckbox_Main7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chckbox_Rep7)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(246, 246, 246));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setPreferredSize(new java.awt.Dimension(440, 65));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel10.setText("Scheduled Date");

        txtfld_ScheduledDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/y"))));
        txtfld_ScheduledDate.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_ScheduledDate.setName("txtfld_ScheduledDate"); // NOI18N

        jLabel53.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 0, 0));
        jLabel53.setText("*");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtfld_ScheduledDate)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel10))
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel53)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_ScheduledDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(246, 246, 246));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setPreferredSize(new java.awt.Dimension(220, 65));

        jLabel12.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel12.setText("Time");

        chckbox_SchedCreationAm.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpScheduledTime.add(chckbox_SchedCreationAm);
        chckbox_SchedCreationAm.setFont(new java.awt.Font("Montserrat Light", 0, 10)); // NOI18N
        chckbox_SchedCreationAm.setText("AM");
        chckbox_SchedCreationAm.setName("chckbox_SchedCreationAm"); // NOI18N
        chckbox_SchedCreationAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckbox_SchedCreationAmActionPerformed(evt);
            }
        });

        chckbox_SchedCreationPM.setBackground(new java.awt.Color(246, 246, 246));
        bttngrpScheduledTime.add(chckbox_SchedCreationPM);
        chckbox_SchedCreationPM.setFont(new java.awt.Font("Montserrat Light", 0, 10)); // NOI18N
        chckbox_SchedCreationPM.setText("PM");
        chckbox_SchedCreationPM.setName("chckbox_SchedCreationPM"); // NOI18N
        chckbox_SchedCreationPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckbox_SchedCreationPMActionPerformed(evt);
            }
        });

        txtfld_TimeSched.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h:mm"))));
        txtfld_TimeSched.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_TimeSched.setName("txtfld_TimeSched"); // NOI18N

        jLabel54.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 0, 0));
        jLabel54.setText("*");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(chckbox_SchedCreationAm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chckbox_SchedCreationPM)
                                .addContainerGap())
                        .addComponent(txtfld_TimeSched, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel21Layout.setVerticalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel21Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel12))
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(chckbox_SchedCreationPM)
                                                .addComponent(chckbox_SchedCreationAm)
                                                .addComponent(jLabel54)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfld_TimeSched, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jPanel4.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(234, 234, 234));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("QTY");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel11)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(234, 234, 234));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel23.setPreferredSize(new java.awt.Dimension(340, 35));

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Materials / Parts");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel13)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(234, 234, 234));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel24.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel14.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Price");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel14)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(234, 234, 234));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel25.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel15.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Amount");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel15)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(246, 246, 246));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel26.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_qty1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_qty1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_qty1.setName("txtfld_qty1"); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_qty1)
                                        .addContainerGap()))
        );
        jPanel26Layout.setVerticalGroup(
                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_qty1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(246, 246, 246));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel27.setPreferredSize(new java.awt.Dimension(340, 35));

        txtfld_MaterialsParts1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MaterialsParts1.setName("txtfld_Materials/Parts1"); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MaterialsParts1)
                                        .addContainerGap()))
        );
        jPanel27Layout.setVerticalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MaterialsParts1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(246, 246, 246));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel28.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_MatPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_MatPrice1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MatPrice1.setName("txtfld_MatPrice1"); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
                jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel28Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MatPrice1)
                                        .addContainerGap()))
        );
        jPanel28Layout.setVerticalGroup(
                jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel28Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MatPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(246, 246, 246));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel29.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_Amount1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_Amount1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Amount1.setName("txtfld_Amount1"); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
                jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel29Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_Amount1)
                                        .addContainerGap()))
        );
        jPanel29Layout.setVerticalGroup(
                jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel29Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_Amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel29);

        jPanel30.setBackground(new java.awt.Color(246, 246, 246));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel30.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_qty2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_qty2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_qty2.setName("txtfld_qty2"); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
                jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_qty2)
                                        .addContainerGap()))
        );
        jPanel30Layout.setVerticalGroup(
                jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_qty2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(246, 246, 246));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel31.setPreferredSize(new java.awt.Dimension(340, 35));

        txtfld_MaterialsParts2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MaterialsParts2.setName("txtfld_Materials/Parts2"); // NOI18N

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
                jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MaterialsParts2)
                                        .addContainerGap()))
        );
        jPanel31Layout.setVerticalGroup(
                jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MaterialsParts2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(246, 246, 246));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_MatPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_MatPrice2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MatPrice2.setName("txtfld_MatPrice2"); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
                jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel32Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MatPrice2)
                                        .addContainerGap()))
        );
        jPanel32Layout.setVerticalGroup(
                jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel32Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MatPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel32);

        jPanel33.setBackground(new java.awt.Color(246, 246, 246));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel33.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_Amount2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_Amount2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Amount2.setName("txtfld_Amount2"); // NOI18N

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
                jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel33Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_Amount2)
                                        .addContainerGap()))
        );
        jPanel33Layout.setVerticalGroup(
                jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel33Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_Amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel33);

        jPanel34.setBackground(new java.awt.Color(246, 246, 246));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel34.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_qty3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_qty3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_qty3.setName("txtfld_qty3"); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
                jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_qty3)
                                        .addContainerGap()))
        );
        jPanel34Layout.setVerticalGroup(
                jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel34Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_qty3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel34);

        jPanel35.setBackground(new java.awt.Color(246, 246, 246));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel35.setPreferredSize(new java.awt.Dimension(340, 35));

        txtfld_MaterialsParts3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MaterialsParts3.setName("txtfld_Materials/Parts3"); // NOI18N

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
                jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel35Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MaterialsParts3)
                                        .addContainerGap()))
        );
        jPanel35Layout.setVerticalGroup(
                jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel35Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MaterialsParts3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        txtfld_MaterialsParts3.getAccessibleContext().setAccessibleName("txtfld_Materials/Parts3");

        jPanel4.add(jPanel35);

        jPanel36.setBackground(new java.awt.Color(246, 246, 246));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_MatPrice3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_MatPrice3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MatPrice3.setName("txtfld_MatPrice3"); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
                jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel36Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MatPrice3)
                                        .addContainerGap()))
        );
        jPanel36Layout.setVerticalGroup(
                jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel36Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MatPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel36);

        jPanel37.setBackground(new java.awt.Color(246, 246, 246));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel37.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_Amount3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_Amount3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Amount3.setName("txtfld_Amount3"); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
                jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_Amount3)
                                        .addContainerGap()))
        );
        jPanel37Layout.setVerticalGroup(
                jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_Amount3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel37);

        jPanel38.setBackground(new java.awt.Color(246, 246, 246));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel38.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_qty4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_qty4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_qty4.setName("txtfld_qty4"); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
                jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel38Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_qty4)
                                        .addContainerGap()))
        );
        jPanel38Layout.setVerticalGroup(
                jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel38Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_qty4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel38);

        jPanel39.setBackground(new java.awt.Color(246, 246, 246));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel39.setPreferredSize(new java.awt.Dimension(340, 35));

        txtfld_MaterialsParts4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MaterialsParts4.setName("txtfld_Materials/Parts4"); // NOI18N

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
                jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel39Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MaterialsParts4)
                                        .addContainerGap()))
        );
        jPanel39Layout.setVerticalGroup(
                jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel39Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MaterialsParts4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel39);

        jPanel40.setBackground(new java.awt.Color(246, 246, 246));
        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel40.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_MatPrice4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_MatPrice4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_MatPrice4.setName("txtfld_MatPrice4"); // NOI18N

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
                jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel40Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_MatPrice4)
                                        .addContainerGap()))
        );
        jPanel40Layout.setVerticalGroup(
                jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel40Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_MatPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(246, 246, 246));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel41.setPreferredSize(new java.awt.Dimension(110, 35));

        txtfld_Amount4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_Amount4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Amount4.setName("txtfld_Amount4"); // NOI18N

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
                jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel41Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_Amount4)
                                        .addContainerGap()))
        );
        jPanel41Layout.setVerticalGroup(
                jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel41Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_Amount4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel41);

        jPanel42.setBackground(new java.awt.Color(234, 234, 234));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel42.setPreferredSize(new java.awt.Dimension(100, 45));

        jLabel16.setBackground(new java.awt.Color(234, 234, 234));
        jLabel16.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Hours");

        jLabel55.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 0, 0));
        jLabel55.setText("*");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
                jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                                .addContainerGap(74, Short.MAX_VALUE)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
                jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel42Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel55)
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel42);

        jPanel43.setBackground(new java.awt.Color(234, 234, 234));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel43.setPreferredSize(new java.awt.Dimension(240, 45));

        jLabel17.setBackground(new java.awt.Color(234, 234, 234));
        jLabel17.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Labor");

        jLabel56.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 0, 0));
        jLabel56.setText("*");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
                jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                                .addContainerGap(143, Short.MAX_VALUE)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
                jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel43Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel56)
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel43);

        jPanel44.setBackground(new java.awt.Color(234, 234, 234));
        jPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel44.setPreferredSize(new java.awt.Dimension(100, 45));

        jLabel18.setBackground(new java.awt.Color(234, 234, 234));
        jLabel18.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Price");
        jLabel18.setPreferredSize(new java.awt.Dimension(35, 18));

        jLabel57.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 0, 0));
        jLabel57.setText("*");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
                jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
                jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel44Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel57)
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel44);

        jPanel47.setBackground(new java.awt.Color(234, 234, 234));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel47.setPreferredSize(new java.awt.Dimension(110, 45));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("<html><p style=\"text-align: center;\">Total<br> Materials</p></html>");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel58.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 0, 0));
        jLabel58.setText("*");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 0, 0));
        jLabel59.setText("*");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
                jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
                jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel58))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jPanel4.add(jPanel47);

        jPanel48.setBackground(new java.awt.Color(246, 246, 246));
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel48.setPreferredSize(new java.awt.Dimension(110, 45));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtfld_TotalMat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_TotalMat.setText("0.00");
        txtfld_TotalMat.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_TotalMat.setName("txtfld_TotalMat"); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
                jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel48Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtfld_TotalMat)
                                .addContainerGap())
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel48Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel48Layout.setVerticalGroup(
                jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtfld_TotalMat)
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel48Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel22)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel48);

        jPanel45.setBackground(new java.awt.Color(246, 246, 246));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel45.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_hrs1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_hrs1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_hrs1.setName("txtfld_hrs1"); // NOI18N

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
                jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_hrs1)
                                        .addContainerGap()))
        );
        jPanel45Layout.setVerticalGroup(
                jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel45Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_hrs1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel45);

        jPanel46.setBackground(new java.awt.Color(246, 246, 246));
        jPanel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel46.setPreferredSize(new java.awt.Dimension(240, 35));

        txtfld_Labor1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Labor1.setName("txtfld_Labor1"); // NOI18N

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
                jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel46Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_Labor1)
                                        .addContainerGap()))
        );
        jPanel46Layout.setVerticalGroup(
                jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel46Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_Labor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel46);

        jPanel49.setBackground(new java.awt.Color(246, 246, 246));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel49.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_LbrPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_LbrPrice1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_LbrPrice1.setName("txtfld_LbrPrice1"); // NOI18N

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
                jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel49Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_LbrPrice1)
                                        .addContainerGap()))
        );
        jPanel49Layout.setVerticalGroup(
                jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel49Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_LbrPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel49);

        jPanel50.setBackground(new java.awt.Color(234, 234, 234));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel50.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Total Labor");

        jLabel60.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 0, 0));
        jLabel60.setText("*");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
                jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel50Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel60))
                                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
                jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel50Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 11, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
        );

        jPanel4.add(jPanel50);

        jPanel51.setBackground(new java.awt.Color(246, 246, 246));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel51.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtfld_TotalLbr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_TotalLbr.setText("0.00");
        txtfld_TotalLbr.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_TotalLbr.setName("txtfld_TotalLbr"); // NOI18N

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
                jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_TotalLbr)
                                        .addContainerGap()))
        );
        jPanel51Layout.setVerticalGroup(
                jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel24)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_TotalLbr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel51);

        jPanel52.setBackground(new java.awt.Color(246, 246, 246));
        jPanel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel52.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_hrs2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_hrs2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_hrs2.setName("txtfld_hrs2"); // NOI18N

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
                jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel52Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_hrs2)
                                        .addContainerGap()))
        );
        jPanel52Layout.setVerticalGroup(
                jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel52Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_hrs2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel52);

        jPanel53.setBackground(new java.awt.Color(246, 246, 246));
        jPanel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel53.setPreferredSize(new java.awt.Dimension(240, 35));

        txtfld_Labor2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Labor2.setName("txtfld_Labor2"); // NOI18N

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
                jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel53Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_Labor2)
                                        .addContainerGap()))
        );
        jPanel53Layout.setVerticalGroup(
                jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel53Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_Labor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel53);

        jPanel54.setBackground(new java.awt.Color(246, 246, 246));
        jPanel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel54.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_LbrPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_LbrPrice2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_LbrPrice2.setName("txtfld_LbrPrice2"); // NOI18N

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
                jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel54Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_LbrPrice2)
                                        .addContainerGap()))
        );
        jPanel54Layout.setVerticalGroup(
                jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel54Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_LbrPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel54);

        jPanel55.setBackground(new java.awt.Color(246, 246, 246));
        jPanel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel55.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
                jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel55Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel55Layout.setVerticalGroup(
                jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel55Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel25)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel55);

        jPanel56.setBackground(new java.awt.Color(246, 246, 246));
        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel56.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
                jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel56Layout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel56Layout.setVerticalGroup(
                jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel56Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel26)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel56);

        jPanel57.setBackground(new java.awt.Color(246, 246, 246));
        jPanel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel57.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_hrs3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_hrs3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_hrs3.setName("txtfld_hrs3"); // NOI18N

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
                jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel57Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_hrs3)
                                        .addContainerGap()))
        );
        jPanel57Layout.setVerticalGroup(
                jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel57Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_hrs3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel57);

        jPanel58.setBackground(new java.awt.Color(246, 246, 246));
        jPanel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel58.setPreferredSize(new java.awt.Dimension(240, 35));

        txtfld_Labor3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_Labor3.setName("txtfld_Labor3"); // NOI18N

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
                jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel58Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_Labor3)
                                        .addContainerGap()))
        );
        jPanel58Layout.setVerticalGroup(
                jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel58Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_Labor3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel58);

        jPanel59.setBackground(new java.awt.Color(246, 246, 246));
        jPanel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel59.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_LbrPrice3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_LbrPrice3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_LbrPrice3.setName("txtfld_LbrPrice3"); // NOI18N

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
                jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel59Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_LbrPrice3)
                                        .addContainerGap()))
        );
        jPanel59Layout.setVerticalGroup(
                jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel59Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_LbrPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel59);

        jPanel60.setBackground(new java.awt.Color(246, 246, 246));
        jPanel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel60.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
                jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel60Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel60Layout.setVerticalGroup(
                jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel60Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel27)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel60);

        jPanel61.setBackground(new java.awt.Color(246, 246, 246));
        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel61.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
                jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel61Layout.createSequentialGroup()
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel61Layout.setVerticalGroup(
                jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel61Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel28)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel61);

        jPanel62.setBackground(new java.awt.Color(234, 234, 234));
        jPanel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel62.setPreferredSize(new java.awt.Dimension(340, 35));

        jLabel19.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("TOTAL LABOR");

        jLabel61.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 0, 0));
        jLabel61.setText("*");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
                jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                                .addContainerGap(207, Short.MAX_VALUE)
                                .addComponent(jLabel61)
                                .addGap(127, 127, 127))
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                                        .addContainerGap(225, Short.MAX_VALUE)
                                        .addComponent(jLabel19)
                                        .addContainerGap()))
        );
        jPanel62Layout.setVerticalGroup(
                jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel62Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel61)
                                .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel62Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel19)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel62);

        jPanel63.setBackground(new java.awt.Color(246, 246, 246));
        jPanel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel63.setPreferredSize(new java.awt.Dimension(100, 35));

        txtfld_TotalLaborInit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_TotalLaborInit.setText("0.00");
        txtfld_TotalLaborInit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_TotalLaborInit.setName("txtfld_TotalLbr"); // NOI18N

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
                jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel63Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_TotalLaborInit)
                                        .addContainerGap()))
        );
        jPanel63Layout.setVerticalGroup(
                jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel63Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtfld_TotalLaborInit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel63);

        jPanel64.setBackground(new java.awt.Color(246, 246, 246));
        jPanel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel64.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
                jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel64Layout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel64Layout.setVerticalGroup(
                jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel64Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel29)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel64);

        jPanel65.setBackground(new java.awt.Color(246, 246, 246));
        jPanel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel65.setPreferredSize(new java.awt.Dimension(110, 35));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
                jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel65Layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel65Layout.setVerticalGroup(
                jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel65Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel30)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel65);

        jPanel66.setBackground(new java.awt.Color(246, 246, 246));
        jPanel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel66.setPreferredSize(new java.awt.Dimension(440, 65));

        jLabel20.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel20.setText("Charge to");

        txtfld_ChargeTo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_ChargeTo.setName("txtfld_ChargeTo"); // NOI18N

        jLabel62.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 0, 0));
        jLabel62.setText("*");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
                jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel66Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(335, Short.MAX_VALUE))
                        .addComponent(txtfld_ChargeTo, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel66Layout.setVerticalGroup(
                jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel66Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel62))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_ChargeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel66);

        jPanel67.setBackground(new java.awt.Color(246, 246, 246));
        jPanel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel67.setPreferredSize(new java.awt.Dimension(110, 65));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
                jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
                jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel67Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel31)
                                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel67);

        jPanel68.setBackground(new java.awt.Color(246, 246, 246));
        jPanel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel68.setPreferredSize(new java.awt.Dimension(110, 65));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
                jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel68Layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel68Layout.setVerticalGroup(
                jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel68Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel32)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel68);

        jPanel69.setBackground(new java.awt.Color(246, 246, 246));
        jPanel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel69.setPreferredSize(new java.awt.Dimension(340, 65));

        jLabel34.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel34.setText("Work completed by");

        txtfld_WrkCompBy.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_WrkCompBy.setName("txtfld_WrkCompBy"); // NOI18N

        jLabel63.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 0, 0));
        jLabel63.setText("*");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
                jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel69Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(170, Short.MAX_VALUE))
                        .addComponent(txtfld_WrkCompBy, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel69Layout.setVerticalGroup(
                jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel69Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel63))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_WrkCompBy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel69);

        jPanel70.setBackground(new java.awt.Color(246, 246, 246));
        jPanel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel70.setPreferredSize(new java.awt.Dimension(100, 65));

        jLabel35.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel35.setText("Date");

        txtfld_DateComp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/y"))));
        txtfld_DateComp.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_DateComp.setName("txtfld_DateComp"); // NOI18N

        jLabel64.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 0, 0));
        jLabel64.setText("*");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
                jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel70Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))
                        .addComponent(txtfld_DateComp, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel70Layout.setVerticalGroup(
                jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel70Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_DateComp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel70);

        jPanel71.setBackground(new java.awt.Color(234, 234, 234));
        jPanel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel71.setPreferredSize(new java.awt.Dimension(110, 65));

        jLabel36.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("TOTAL");

        jLabel65.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 0, 0));
        jLabel65.setText("*");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
                jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel71Layout.createSequentialGroup()
                                .addContainerGap(28, Short.MAX_VALUE)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
                jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel71Layout.createSequentialGroup()
                                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel71Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel71Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel65)))
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel71);

        jPanel72.setBackground(new java.awt.Color(246, 246, 246));
        jPanel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel72.setPreferredSize(new java.awt.Dimension(110, 65));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtfld_TOTAL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        txtfld_TOTAL.setText("0.00");
        txtfld_TOTAL.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_TOTAL.setName("txtfld_TOTAL"); // NOI18N

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
                jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel72Layout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel72Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_TOTAL)
                                        .addContainerGap()))
        );
        jPanel72Layout.setVerticalGroup(
                jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel72Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel37)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel72Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtfld_TOTAL)
                                        .addContainerGap()))
        );

        jPanel4.add(jPanel72);

        jPanel73.setBackground(new java.awt.Color(246, 246, 246));
        jPanel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel73.setPreferredSize(new java.awt.Dimension(440, 65));

        jLabel38.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel38.setText("Inspected / Approved by");

        txtfld_InspAppBy.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_InspAppBy.setName("txtfld_Insp/AppBy"); // NOI18N

        jLabel66.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(204, 0, 0));
        jLabel66.setText("*");

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
                jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel73Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(235, Short.MAX_VALUE))
                        .addComponent(txtfld_InspAppBy, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel73Layout.setVerticalGroup(
                jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel73Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel66))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_InspAppBy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel73);

        jPanel74.setBackground(new java.awt.Color(246, 246, 246));
        jPanel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel74.setPreferredSize(new java.awt.Dimension(220, 65));

        jLabel39.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel39.setText("Date");

        txtfld_DateInsp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/y"))));
        txtfld_DateInsp.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtfld_DateInsp.setName("txtfld_DateInsp"); // NOI18N

        jLabel67.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(204, 0, 0));
        jLabel67.setText("*");

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
                jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel74Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(155, Short.MAX_VALUE))
                        .addComponent(txtfld_DateInsp, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel74Layout.setVerticalGroup(
                jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel74Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel67))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfld_DateInsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel74);

        bttnSave.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        bttnSave.setText("SAVE");
        bttnSave.setBorder(new javax.swing.border.MatteBorder(null));
        bttnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSaveActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 0, 0));
        jLabel42.setText("*Required");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bttnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(285, 285, 285))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel42))
                                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(bttnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1569, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chckbox_SchedCreationPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbox_SchedCreationPMActionPerformed
        if (chckbox_SchedCreationPM.isSelected()) {
            SchedTime = " pm";
        }
    }//GEN-LAST:event_chckbox_SchedCreationPMActionPerformed

    private void chckbox_SchedCreationAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbox_SchedCreationAmActionPerformed
        if (chckbox_SchedCreationAm.isSelected()) {
            SchedTime = " am";
        }
    }//GEN-LAST:event_chckbox_SchedCreationAmActionPerformed

    private void bttnOkErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnOkErrorActionPerformed
        frameErrorMessage.setVisible(false);
        frameErrorMessage.dispose();

    }//GEN-LAST:event_bttnOkErrorActionPerformed

    private void bttnSaveActionPerformed(ActionEvent evt) {
        ArrayList<Double> tempMatAmount = new ArrayList<>();
        ArrayList<String> tempServiceID = new ArrayList<>();
        ArrayList<String> tempNatureofService = new ArrayList<>();
        ArrayList<String> tempDescription = new ArrayList<>();
        ArrayList<Integer> tempQTY = new ArrayList<>();
        ArrayList<String> tempMatParts = new ArrayList<>();
        ArrayList<Double> tempMatPrice = new ArrayList<>();
        ArrayList<Integer> tempHours = new ArrayList<>();
        ArrayList<String> tempLabor = new ArrayList<>();
        ArrayList<String> tempLbrID = new ArrayList<>();
        ArrayList<Double> tempLaborAmount = new ArrayList<>();
        ArrayList<String> tempMatID = new ArrayList<>();
        try {
            ArrayList<Integer> errors = new ArrayList<>();
            do {

                errors.clear();
                tempMatAmount.clear();
//                tempServiceID.clear();
//                tempNatureofService.clear();
//                tempDescription.clear();
                tempQTY.clear();
                tempMatParts.clear();
                tempMatPrice.clear();
//                tempHours.clear();
//                tempLabor.clear();
//                tempLbrID.clear();
//                tempLaborAmount.clear();
                tempMatID.clear();

                if (chckbox_Main1.isSelected()) {
                    tempServiceID.add("M0001");
                    tempNatureofService.add("Maintenance");
                } else if (!chckbox_Rep1.isSelected()) {
                    errors.add(1);
                }
                if (chckbox_Rep1.isSelected()) {
                    tempServiceID.add("R0001");
                    tempNatureofService.add("Repair");
                } else if (!chckbox_Main1.isSelected()) {
                    errors.add(1);
                }
                if (chckbox_Main2.isSelected()) {
                    tempNatureofService.add("Maintenance");
                    if (tempServiceID.contains("M0001")) {
                        tempServiceID.add("M0002");
                    } else {
                        tempServiceID.add("M0001");
                    }
                }
                if (chckbox_Rep2.isSelected()) {
                    tempNatureofService.add("Repair");
                    if (tempServiceID.contains("R0001")) {
                        tempServiceID.add("R0002");
                    } else {
                        tempServiceID.add("R0001");
                    }
                }
                if (chckbox_Main3.isSelected()) {
                    tempNatureofService.add("Maintenance");
                    if (tempServiceID.contains("M0002")) {
                        tempServiceID.add("M0003");
                    } else if (tempServiceID.contains("M0001")) {
                        tempServiceID.add("M0002");
                    } else {
                        tempServiceID.add("M0001");
                    }
                }
                if (chckbox_Rep3.isSelected()) {
                    tempNatureofService.add("Repair");
                    if (tempServiceID.contains("R0002")) {
                        tempServiceID.add("R0003");
                    } else if (tempServiceID.contains("R0001")) {
                        tempServiceID.add("R0002");
                    } else {
                        tempServiceID.add("R0001");
                    }
                }
                if (chckbox_Main4.isSelected()) {
                    tempNatureofService.add("Maintenance");
                    if (tempServiceID.contains("M0003")) {
                        tempServiceID.add("M0004");
                    } else if (tempServiceID.contains("M0002")) {
                        tempServiceID.add("M0003");
                    } else if (tempServiceID.contains("M0001")) {
                        tempServiceID.add("M0002");
                    } else {
                        tempServiceID.add("M0001");
                    }
                }
                if (chckbox_Rep4.isSelected()) {
                    tempNatureofService.add("Repair");
                    if (tempServiceID.contains("R0003")) {
                        tempServiceID.add("R0004");
                    } else if (tempServiceID.contains("R0002")) {
                        tempServiceID.add("R0003");
                    } else if (tempServiceID.contains("R0001")) {
                        tempServiceID.add("R0002");
                    } else {
                        tempServiceID.add("R0001");
                    }
                }
                if (chckbox_Main5.isSelected()) {
                    tempNatureofService.add("Maintenance");
                    if (tempServiceID.contains("M0004")) {
                        tempServiceID.add("M0005");
                    } else if (tempServiceID.contains("M0003")) {
                        tempServiceID.add("M0004");
                    } else if (tempServiceID.contains("M0002")) {
                        tempServiceID.add("M0003");
                    } else if (tempServiceID.contains("M0001")) {
                        tempServiceID.add("M0002");
                    } else {
                        tempServiceID.add("M0001");
                    }
                }
                if (chckbox_Rep5.isSelected()) {
                    tempNatureofService.add("Repair");
                    if (tempServiceID.contains("R0004")) {
                        tempServiceID.add("R0005");
                    } else if (tempServiceID.contains("R0003")) {
                        tempServiceID.add("R0004");
                    } else if (tempServiceID.contains("R0002")) {
                        tempServiceID.add("R0003");
                    } else if (tempServiceID.contains("R0001")) {
                        tempServiceID.add("R0002");
                    } else {
                        tempServiceID.add("R0001");
                    }
                }
                if (chckbox_Main6.isSelected()) {
                    tempNatureofService.add("Maintenance");
                    if (tempServiceID.contains("M0005")) {
                        tempServiceID.add("M0006");
                    } else if (tempServiceID.contains("M0004")) {
                        tempServiceID.add("M0005");
                    } else if (tempServiceID.contains("M0003")) {
                        tempServiceID.add("M0004");
                    } else if (tempServiceID.contains("M0002")) {
                        tempServiceID.add("M0003");
                    } else if (tempServiceID.contains("M0001")) {
                        tempServiceID.add("M0002");
                    } else {
                        tempServiceID.add("M0001");
                    }
                }
                if (chckbox_Rep6.isSelected()) {
                    tempNatureofService.add("Repair");
                    if (tempServiceID.contains("R0005")) {
                        tempServiceID.add("R0006");
                    } else if (tempServiceID.contains("R0004")) {
                        tempServiceID.add("R0005");
                    } else if (tempServiceID.contains("R0003")) {
                        tempServiceID.add("R0004");
                    } else if (tempServiceID.contains("R0002")) {
                        tempServiceID.add("R0003");
                    } else if (tempServiceID.contains("R0001")) {
                        tempServiceID.add("R0002");
                    } else {
                        tempServiceID.add("R0001");
                    }
                }
                if (chckbox_Main7.isSelected()) {
                    tempNatureofService.add("Maintenance");
                    if (tempServiceID.contains("M0006")) {
                        tempServiceID.add("M0007");
                    } else if (tempServiceID.contains("M0005")) {
                        tempServiceID.add("M0006");
                    } else if (tempServiceID.contains("M0004")) {
                        tempServiceID.add("M0005");
                    } else if (tempServiceID.contains("M0003")) {
                        tempServiceID.add("M0004");
                    } else if (tempServiceID.contains("M0002")) {
                        tempServiceID.add("M0003");
                    } else if (tempServiceID.contains("M0001")) {
                        tempServiceID.add("M0002");
                    } else {
                        tempServiceID.add("M0001");
                    }
                }
                if (chckbox_Rep7.isSelected()) {
                    tempNatureofService.add("Repair");
                    if (tempServiceID.contains("R0006")) {
                        tempServiceID.add("R0007");
                    } else if (tempServiceID.contains("R0005")) {
                        tempServiceID.add("R0006");
                    } else if (tempServiceID.contains("R0004")) {
                        tempServiceID.add("R0005");
                    } else if (tempServiceID.contains("R0003")) {
                        tempServiceID.add("R0004");
                    } else if (tempServiceID.contains("R0002")) {
                        tempServiceID.add("R0003");
                    } else if (tempServiceID.contains("R0001")) {
                        tempServiceID.add("R0002");
                    } else {
                        tempServiceID.add("R0001");
                    }
                }


                String txtDescription1 = txtfld_Descrption1.getText();
                if (txtDescription1.equals(""))
                    errors.add(1);
                String txtDescription2 = txtfld_Descrption2.getText();
                String txtDescription3 = txtfld_Descrption3.getText();
                String txtDescription4 = txtfld_Descrption4.getText();
                String txtDescription5 = txtfld_Descrption5.getText();
                String txtDescription6 = txtfld_Descrption6.getText();
                String txtDescription7 = txtfld_Descrption7.getText();

                tempDescription.add(txtDescription1);
                if (!txtfld_Descrption1.getText().isEmpty() && !txtfld_Descrption2.getText().isEmpty())
                    tempDescription.add(txtDescription2);
                if (!txtfld_Descrption2.getText().isEmpty() && !txtfld_Descrption3.getText().isEmpty())
                    tempDescription.add(txtDescription3);
                if (!txtfld_Descrption3.getText().isEmpty() && !txtfld_Descrption4.getText().isEmpty())
                    tempDescription.add(txtDescription4);
                if (!txtfld_Descrption4.getText().isEmpty() && !txtfld_Descrption5.getText().isEmpty())
                    tempDescription.add(txtDescription5);
                if (!txtfld_Descrption5.getText().isEmpty() && !txtfld_Descrption6.getText().isEmpty())
                    tempDescription.add(txtDescription6);
                if (!txtfld_Descrption6.getText().isEmpty() && !txtfld_Descrption7.getText().isEmpty())
                    tempDescription.add(txtDescription7);


                tempMatID.add("MAT0001");
                if (!txtfld_qty2.getText().isEmpty()) tempMatID.add("MAT0002");
                if (!txtfld_qty3.getText().isEmpty()) tempMatID.add("MAT0003");
                if (!txtfld_qty4.getText().isEmpty()) tempMatID.add("MAT0004");


                tempQTY.add(0,0);
                if (!txtfld_qty1.getText().isEmpty()) {
                    qty1 = Integer.parseInt(txtfld_qty1.getText());
                    tempQTY.set(0,qty1);
                }

                if (!txtfld_qty1.getText().isEmpty() && !txtfld_qty2.getText().isEmpty()) {
                    qty2 = Integer.parseInt(txtfld_qty2.getText());
                    tempQTY.add(qty2);
                }
                if (!txtfld_qty2.getText().isEmpty() && !txtfld_qty3.getText().isEmpty()) {
                    qty3 = Integer.parseInt(txtfld_qty3.getText());
                    tempQTY.add(qty3);
                }
                if (!txtfld_qty3.getText().isEmpty() && !txtfld_qty4.getText().isEmpty()) {
                    qty4 = Integer.parseInt(txtfld_qty4.getText());
                    tempQTY.add(qty4);
                }

                String txtMaterialsParts1 = txtfld_MaterialsParts1.getText();
                String txtMaterialsParts2 = txtfld_MaterialsParts2.getText();
                String txtMaterialsParts3 = txtfld_MaterialsParts3.getText();
                String txtMaterialsParts4 = txtfld_MaterialsParts4.getText();

                tempMatParts.add("No Materials/Parts");
                if (!txtfld_MaterialsParts1.getText().isEmpty()) {
                    tempMatParts.set(0, txtMaterialsParts1);
                }
                if (!txtfld_MaterialsParts1.getText().isEmpty() && !txtfld_MaterialsParts2.getText().isEmpty()) {
                    tempMatParts.add(txtMaterialsParts2);
                }
                if (!txtfld_MaterialsParts2.getText().isEmpty() && !txtfld_MaterialsParts3.getText().isEmpty()) {
                    tempMatParts.add(txtMaterialsParts3);
                }
                if (!txtfld_MaterialsParts3.getText().isEmpty() && !txtfld_MaterialsParts4.getText().isEmpty()) {
                    tempMatParts.add(txtMaterialsParts4);
                }

                tempMatPrice.add(0, 0.00);
                if (!txtfld_MatPrice1.getText().isEmpty()) {
                    dblMatPrice1 = Double.parseDouble(txtfld_MatPrice1.getText());
                    tempMatPrice.set(0, dblMatPrice1);
                }
                if (!txtfld_MatPrice1.getText().isEmpty() && !txtfld_MatPrice2.getText().isEmpty()) {
                    dblMatPrice2 = Double.parseDouble(txtfld_MatPrice2.getText());
                    tempMatPrice.add(dblMatPrice2);
                }
                if (!txtfld_MatPrice2.getText().isEmpty() && !txtfld_MatPrice3.getText().isEmpty()) {
                    dblMatPrice3 = Double.parseDouble(txtfld_MatPrice3.getText());
                    tempMatPrice.add(dblMatPrice3);
                }
                if (!txtfld_MatPrice3.getText().isEmpty() && !txtfld_MatPrice4.getText().isEmpty()) {
                    dblMatPrice4 = Double.parseDouble(txtfld_MatPrice4.getText());
                    tempMatPrice.add(dblMatPrice4);
                }

                tempMatAmount.add(0, 0.00);
                if (!txtfld_Amount1.getText().isEmpty()) {
                    dblAmount1 = Double.parseDouble(txtfld_Amount1.getText());
                    tempMatAmount.set(0, dblAmount1);
                }
                if (!txtfld_Amount1.getText().isEmpty() && !txtfld_Amount2.getText().isEmpty()) {
                    dblAmount2 = Double.parseDouble(txtfld_Amount2.getText());
                    tempMatAmount.add(dblAmount2);
                }
                if (!txtfld_Amount2.getText().isEmpty() && !txtfld_Amount3.getText().isEmpty()) {
                    dblAmount3 = Double.parseDouble(txtfld_Amount3.getText());
                    tempMatAmount.add(dblAmount3);
                }
                if (!txtfld_Amount3.getText().isEmpty() && !txtfld_Amount4.getText().isEmpty()) {
                    dblAmount4 = Double.parseDouble(txtfld_Amount4.getText());
                    tempMatAmount.add(dblAmount4);
                }

                if (!txtfld_hrs1.getText().isEmpty()) {
                    hrs1 = Integer.parseInt(txtfld_hrs1.getText());
                    tempHours.add(hrs1);
                } else
                    errors.add(1);
                if (!txtfld_hrs1.getText().isEmpty() && !txtfld_hrs2.getText().isEmpty()) {
                    hrs2 = Integer.parseInt(txtfld_hrs2.getText());
                    tempHours.add(hrs2);
                }
                if (!txtfld_hrs2.getText().isEmpty() && !txtfld_hrs3.getText().isEmpty()) {
                    hrs3 = Integer.parseInt(txtfld_hrs3.getText());
                    tempHours.add(hrs3);
                }


                String txtLabor1 = txtfld_Labor1.getText();
                String txtLabor2 = txtfld_Labor2.getText();
                String txtLabor3 = txtfld_Labor3.getText();

                if (!txtfld_Labor1.getText().isEmpty()) {
                    tempLabor.add(txtLabor1);
                } else if(txtfld_Labor1.getText().isEmpty()){
                    errors.add(1);
                }
                if (!txtfld_Labor1.getText().isEmpty() && !txtfld_Labor2.getText().isEmpty()) {
                    tempLabor.add(txtLabor2);
                }
                if (!txtfld_Labor2.getText().isEmpty() && !txtfld_Labor3.getText().isEmpty()) {
                    tempLabor.add(txtLabor3);
                }

                if (!txtfld_LbrPrice1.getText().isEmpty()) {
                    dblLaborPrice1 = Double.parseDouble(txtfld_LbrPrice1.getText());
                    tempLaborAmount.add(dblLaborPrice1);
                }else if(txtfld_LbrPrice1.getText().isEmpty()) {
                    errors.add(1);
                }
                if (!txtfld_LbrPrice1.getText().isEmpty() && !txtfld_LbrPrice2.getText().isEmpty()) {
                    dblLaborPrice2 = Double.parseDouble(txtfld_LbrPrice2.getText());
                    tempLaborAmount.add(dblLaborPrice2);
                }
                if (!txtfld_LbrPrice3.getText().isEmpty() && !txtfld_LbrPrice3.getText().isEmpty()) {
                    dblLaborPrice3 = Double.parseDouble(txtfld_LbrPrice3.getText());
                    tempLaborAmount.add(dblLaborPrice3);
                }

                txtTakenBy = txtfld_Takenby.getText();
                if (txtTakenBy.equals(""))
                    errors.add(1);
                txtRequestedBy = txtfld_Requestedby.getText();
                if (txtRequestedBy.equals(""))
                    errors.add(1);
                txtDept = txtfld_Dept.getText();
                if (txtDept.equals(""))
                    errors.add(1);
                txtBldgfloor = txtfld_bldgfloor1.getText();
                if (txtBldgfloor.equals(""))
                    errors.add(1);
                MachineNo = Integer.parseInt(txtfld_MachineNo.getText());
                txtTimeSched = txtfld_TimeSched.getText();
                if (txtTimeSched.equals(""))
                    errors.add(1);
                else {
                    txtTimeSched = txtfld_TimeSched.getText() + SchedTime;
                }
                txtChargeTo = txtfld_ChargeTo.getText();
                if (txtChargeTo.equals(""))
                    errors.add(1);
                txtWrkCompBy = txtfld_WrkCompBy.getText();
                if (txtWrkCompBy.equals(""))
                    errors.add(1);
                txtInsAppBy = txtfld_InspAppBy.getText();
                if (txtInsAppBy.equals(""))
                    errors.add(1);
                txtdateofcreation = txtfld_dateofcreation.getText();
                if (txtdateofcreation.equals(""))
                    errors.add(1);
                txtDateWanted = txtfld_DateWanted.getText();
                if (txtDateWanted.equals(""))
                    errors.add(1);
                txtScheduleDate = txtfld_ScheduledDate.getText();
                if (txtScheduleDate.equals(""))
                    errors.add(1);
                txtDateComp = txtfld_DateComp.getText();
                if (txtDateComp.equals(""))
                    errors.add(1);
                txtDateInsp = txtfld_DateInsp.getText();
                if (txtDateInsp.equals(""))
                    errors.add(1);
                dblTotalLaborInit = Double.parseDouble(txtfld_TotalLaborInit.getText());
                dblTotalMaterials = Double.parseDouble(txtfld_TotalMat.getText());
                dblTotal = Double.parseDouble(txtfld_TOTAL.getText());




                if (!txtfld_Labor1.getText().isEmpty())
                    tempLbrID.add("LBR0001");
                else if(txtfld_Labor1.getText().isEmpty()){
                    errors.add(1);
                }
                if (!txtfld_Labor2.getText().isEmpty()) tempLbrID.add("LBR0002");
                if (!txtfld_Labor3.getText().isEmpty()) tempLbrID.add("LBR0003");

                if (!errors.isEmpty()) {
                    throw new java.lang.RuntimeException("Please fill out all fields");
                }

            } while (!errors.isEmpty());

            try {

                objConn = DriverManager.getConnection("jdbc:ucanaccess://D:\\Files\\Documents\\PUPDocs\\InfoMngmt\\Project\\IT Work Order Input Form\\Work-Order-Application-JAVA\\WorkOrderInputForm\\src\\main\\java\\sourcecode\\workorderinputform\\WODatabase Sample.accdb");

                try {
                    String sqlWorkOrder = "INSERT INTO WORK_ORDER (DateofCreation, TakenBy, RequestedBy, Dept, BLDGFloor, MachineNo, DateWanted, ChargeTo, WorkCompletedBy, DateCompleted, InspectedBy, " +
                            "DateInspected, ScheduledDate, ScheduledTime, TotalMaterials, TotalLabor, Total)" + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement psWorkOrder = objConn.prepareStatement(sqlWorkOrder);
                    if (errors.isEmpty()) {
                        psWorkOrder.setString(1, txtdateofcreation);
                        psWorkOrder.setString(2, txtTakenBy);
                        psWorkOrder.setString(3, txtRequestedBy);
                        psWorkOrder.setString(4, txtDept);
                        psWorkOrder.setString(5, txtBldgfloor);
                        psWorkOrder.setInt(6, MachineNo);
                        psWorkOrder.setString(7, txtDateWanted);
                        psWorkOrder.setString(8, txtChargeTo);
                        psWorkOrder.setString(9, txtWrkCompBy);
                        psWorkOrder.setString(10, txtDateComp);
                        psWorkOrder.setString(11, txtInsAppBy);
                        psWorkOrder.setString(12, txtDateInsp);
                        psWorkOrder.setString(13, txtScheduleDate);
                        psWorkOrder.setString(14, txtTimeSched);
                        psWorkOrder.setDouble(15, dblTotalMaterials);
                        psWorkOrder.setDouble(16, dblTotalLaborInit);
                        psWorkOrder.setDouble(17, dblTotal);

                        psWorkOrder.executeUpdate();
                    }
                } catch (Exception objEx) {
                    System.out.println(objEx);
                    frameErrorMessage.setVisible(true);
                    frameErrorMessage.setLocationRelativeTo(null);
                    frameErrorMessage.setSize(325, 150);
                }

                try {
                    ResultSet rs;
                    Statement st = objConn.createStatement();
                    String query = ("SELECT * FROM WORK_ORDER ORDER BY WorkOrderID DESC LIMIT 1;");
                    rs = st.executeQuery(query);
                    if (rs.next()) {
                        sqlWOID = rs.getString("WorkOrderID");
                    }
                } catch (Exception objEx) {
                    System.out.println(objEx);
                }
                try {
                    objConn.setAutoCommit(false);
                    PreparedStatement psService = objConn.prepareStatement("INSERT INTO SERVICE (Work_Order_ID, ServiceID, NatureofService, Description)" + " VALUES (?, ?, ?, ?)");
                    System.out.println(sqlWOID);
                    for (int i = 0; i < tempServiceID.size(); i++) {
                        psService.setString(1, sqlWOID);
                        psService.setString(2, tempServiceID.get(i));
                        psService.setString(3, tempNatureofService.get(i));
                        psService.setString(4, tempDescription.get(i));
                        psService.addBatch();
                    }
                    psService.executeBatch();
                    objConn.commit();
                } catch (Exception objEx) {
                    System.out.println(objEx);
                }

                try {
                    objConn.setAutoCommit(false);
                    PreparedStatement psMaterial = objConn.prepareStatement("INSERT INTO MATERIAL (Work_Order_ID, MatID, QTY, MatName, MatPrice, MatAmount)" + " VALUES (?, ?, ?, ?, ?, ?)");
                    for (int i = 0; i < tempMatID.size(); i++) {
                        psMaterial.setString(1, sqlWOID);
                        psMaterial.setString(2, tempMatID.get(i));
                        psMaterial.setInt(3, tempQTY.get(i));
                        psMaterial.setString(4, tempMatParts.get(i));
                        psMaterial.setDouble(5, tempMatPrice.get(i));
                        psMaterial.setDouble(6, tempMatAmount.get(i));
                        psMaterial.addBatch();
                    }
                    psMaterial.executeBatch();
                    objConn.commit();
                } catch (Exception objEx) {
                    System.out.println(objEx);
                }

                try {
                    objConn.setAutoCommit(false);
                    PreparedStatement psLabor = objConn.prepareStatement("INSERT INTO LABOR (Work_Order_ID, LaborID, Hours, Labor, LaborAmount)" + " VALUES (?, ?, ?, ?, ?)");
                    for (int i = 0; i < tempLbrID.size(); i++) {
                        psLabor.setString(1, sqlWOID);
                        psLabor.setString(2, tempLbrID.get(i));
                        psLabor.setInt(3, tempHours.get(i));
                        psLabor.setString(4, tempLabor.get(i));
                        psLabor.setDouble(5, tempLaborAmount.get(i));
                        psLabor.addBatch();
                    }
                    psLabor.executeBatch();
                    objConn.commit();
                } catch (Exception objEx) {
                    System.out.println(objEx);
                }
            } catch (Exception objEx) {

                System.out.println("Database failed!");
                System.out.println(objEx);

            } finally {

                if (objConn != null) {

                    try {
                        objConn.close();
                    } catch (Exception objEx) {
                        System.out.println("Problem closing the database!");
                        System.out.println(objEx);
                    }
                }
                System.out.println("SQL completed");
            }
        } catch (Exception objEx) {
            System.out.println(objEx);
        }
    }
    // End of variables declaration//GEN-END:variables
}
