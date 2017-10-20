/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License");  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * Copyright (C) 2004 Sorokin R.P. (sorokinru@iias.spb.su)
 * and Object-oriented Geoinformatics Systems Laboratory (http://niggis.iias.spb.su)
 * All Rights Reserved.
 */

package ru.igis.omtab;

import java.util.Map;

/**
 * GUI to control movement of Navigating object by hand
 * @author srp
 */
public class NavObFrame extends javax.swing.JFrame {
    
    /**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * Creates new form NavObFrame
     * @param no - corresponding Navigating object
     */
    public NavObFrame(NavOb no) {
        navOb = no;
        initComponents();
        setTitle(no.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanelCoordinates = new javax.swing.JPanel();
        jLabelLat = new javax.swing.JLabel();
        jTextFieldLat = new javax.swing.JTextField();
        jLabelLon = new javax.swing.JLabel();
        jTextFieldLon = new javax.swing.JTextField();
        jLabelCourse = new javax.swing.JLabel();
        jTextFieldCourse = new javax.swing.JTextField();
        jLabelAltitude = new javax.swing.JLabel();
        jTextFieldAltitude = new javax.swing.JTextField();
        jLabelSpeed = new javax.swing.JLabel();
        jTextFieldSpeed = new javax.swing.JTextField();
        jLabelTangage = new javax.swing.JLabel();
        jTextFieldTangage = new javax.swing.JTextField();
        jButtonAttr = new javax.swing.JButton();
        jButtonTask = new javax.swing.JButton();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        setTitle("Object Control");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanelCoordinates.setLayout(new java.awt.GridLayout(7, 1));

        jLabelLat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCoordinates.add(jLabelLat);

        jTextFieldLat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLatActionPerformed(evt);
            }
        });

        jPanelCoordinates.add(jTextFieldLat);

        jLabelLon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCoordinates.add(jLabelLon);

        jTextFieldLon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLonActionPerformed(evt);
            }
        });

        jPanelCoordinates.add(jTextFieldLon);

        jLabelAltitude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAltitude.setToolTipText("");
        jPanelCoordinates.add(jLabelAltitude);

        jTextFieldAltitude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAltitudeActionPerformed(evt);
            }
        });
        jPanelCoordinates.add(jTextFieldAltitude);

        jLabelCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCourse.setToolTipText("");
        jPanelCoordinates.add(jLabelCourse);

        jTextFieldCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCourseActionPerformed(evt);
            }
        });
        jPanelCoordinates.add(jTextFieldCourse);
        
        jLabelSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCoordinates.add(jLabelSpeed);

        jTextFieldSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSpeedActionPerformed(evt);
            }
        });
        jPanelCoordinates.add(jTextFieldSpeed);

        jLabelTangage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCoordinates.add(jLabelTangage);

        jTextFieldTangage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTangageActionPerformed(evt);
            }
        });
        jPanelCoordinates.add(jTextFieldTangage);

        jButtonAttr.setText("Attributes");
        jButtonAttr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAttrActionPerformed(evt);
            }
        });

        jPanelCoordinates.add(jButtonAttr);

        jButtonTask.setText("Task");
        jButtonTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaskActionPerformed(evt);
            }
        });

        jPanelCoordinates.add(jButtonTask);
        
        getContentPane().add(jPanelCoordinates);

        pack();
    }//GEN-END:initComponents

    private void jButtonTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaskActionPerformed
    	navOb.execTask();
    }//GEN-LAST:event_jButtonTaskActionPerformed

    private void jButtonAttrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaskActionPerformed
    	Map<Object, Object> attr = navOb.getAttributes();
    	if(attr != null)
    		new Context().update(attr,navOb.name+" attributes");
    }//GEN-LAST:event_jButtonTaskActionPerformed

    private void jTextFieldTangageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSpeedActionPerformed
        navOb.setFormTangage(jTextFieldTangage.getText());
        jTextFieldTangage.setText("");
    }//GEN-LAST:event_jTextFieldSpeedActionPerformed

    private void jTextFieldSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSpeedActionPerformed
        navOb.setFormSpeed(jTextFieldSpeed.getText());
        jTextFieldSpeed.setText("");
    }//GEN-LAST:event_jTextFieldSpeedActionPerformed

    private void jTextFieldCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCourseActionPerformed
        navOb.setFormCourse(jTextFieldCourse.getText());
        jTextFieldCourse.setText("");
    }//GEN-LAST:event_jTextFieldCourseActionPerformed

    private void jTextFieldAltitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAltitudeActionPerformed
        navOb.setFormAltitude(jTextFieldAltitude.getText());
        jTextFieldAltitude.setText("");
    }//GEN-LAST:event_jTextFieldAltitudeActionPerformed

    private void jTextFieldLonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLonActionPerformed
        navOb.setFormLongitude(jTextFieldLon.getText());
        jTextFieldLon.setText("");
    }//GEN-LAST:event_jTextFieldLonActionPerformed

    private void jTextFieldLatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLatActionPerformed
        navOb.setFormLatitude(jTextFieldLat.getText());
        jTextFieldLat.setText("");
    }//GEN-LAST:event_jTextFieldLatActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        dispose();
    }//GEN-LAST:event_exitForm
    
    /**
     * Write to Latitude field
     * @param lat - Latitude
     */    
    public void setLat(String lat){
    	String[] a = lat.split(" ");
        jLabelLat.setText("Lat "+a[0]+"° "+a[1]+"′");
    }
    
    /**
     * Write to Longitude field
     * @param lon - Longitude
     */    
    public void setLon(String lon){
    	String[] a = lon.split(" ");
        jLabelLon.setText("Lon "+a[0]+"° "+a[1]+"′");
    }
    
    /**
     * Write to Course field
     * @param crs - Course
     */    
    public void setCourse(int crs){
        jLabelCourse.setText("Crs "+crs+"°");
    }
    
    /**
     * Write to Altitude field
     * @param alt - Altitude
     */    
    public void setAltitude(int alt){
        jLabelAltitude.setText("Alt "+alt+" m");
    }

    /**
     * Write to Speed field
     * @param d - Speed
     */    
    public void setSpeed(double d){
        jLabelSpeed.setText("Spd "+d+" knt");
    }
         
    /**
     * Write to Speed field
     * @param d - Speed
     */    
    public void setTangage(double d){
        jLabelTangage.setText("Tng "+d+"°");
    }
         
    private NavOb navOb;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAttr;
    private javax.swing.JButton jButtonTask;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelAltitude;
    private javax.swing.JLabel jLabelLat;
    private javax.swing.JLabel jLabelLon;
    private javax.swing.JLabel jLabelSpeed;
    private javax.swing.JLabel jLabelTangage;
    private javax.swing.JPanel jPanelCoordinates;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldAltitude;
    private javax.swing.JTextField jTextFieldLat;
    private javax.swing.JTextField jTextFieldLon;
    private javax.swing.JTextField jTextFieldSpeed;
    private javax.swing.JTextField jTextFieldTangage;
    // End of variables declaration//GEN-END:variables
    
}