/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlda;

import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GiaoDienMuonSach extends javax.swing.JFrame {

    DanhSachSach dss = new DanhSachSach();
    QuanLiMuonSach quanli = new QuanLiMuonSach();
    DefaultTableModel tab = new DefaultTableModel();

    /**
     * Creates new form GiaoDienMuonSach
     */
    public GiaoDienMuonSach() {
        initComponents();
        tbBangThue.setModel(tab);
        tab.setColumnIdentifiers(new Object[]{"Mã Người Thuê", "Mã Sách", "Tên Sách", "Ngày Thuê", "Tiền Thuê"});
        btnThue.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNguoiThue = new javax.swing.JTextField();
        txtHinhThuc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNgayThue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtThoiGianThue = new javax.swing.JFormattedTextField();
        btnThue = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        btnTroLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBangThue = new javax.swing.JTable();
        btnXemSach = new javax.swing.JButton();
        btnXemDanhSach = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mã Sách");

        txtMaSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });
        txtMaSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaSachKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Người Thuê");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Hình Thức");

        txtNguoiThue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNguoiThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNguoiThueActionPerformed(evt);
            }
        });
        txtNguoiThue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNguoiThueKeyPressed(evt);
            }
        });

        txtHinhThuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHinhThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thuê Theo Ngày", "Thuê Theo Giờ" }));
        txtHinhThuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtHinhThucItemStateChanged(evt);
            }
        });
        txtHinhThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHinhThucActionPerformed(evt);
            }
        });
        txtHinhThuc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtHinhThucPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ngày Thuê");

        txtNgayThue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNgayThueKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Thời Gian Thuê");

        txtThoiGianThue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txtThoiGianThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThoiGianThueActionPerformed(evt);
            }
        });
        txtThoiGianThue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtThoiGianThueKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtThoiGianThueKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtThoiGianThueKeyTyped(evt);
            }
        });

        btnThue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThue.setText("Thuê");
        btnThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThueActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Thành Tiền");

        txtGiaTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addGap(799, 799, 799))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNguoiThue, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNgayThue, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtThoiGianThue, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtHinhThuc, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThue, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNguoiThue))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(txtNgayThue))
                    .addComponent(btnThue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHinhThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(txtThoiGianThue)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnTroLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTroLai.setText("Quay lại Thư Viện");
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        tbBangThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbBangThue);

        btnXemSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXemSach.setText("Xem Sách");
        btnXemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemSachActionPerformed(evt);
            }
        });

        btnXemDanhSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXemDanhSach.setText("Danh Sách Thuê");
        btnXemDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDanhSachActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Tổng Tiền Thuê");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(146, 146, 146))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(btnXemSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXemDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnXemDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void txtNguoiThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNguoiThueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguoiThueActionPerformed

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void txtHinhThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHinhThucActionPerformed

    }//GEN-LAST:event_txtHinhThucActionPerformed

    private void btnThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThueActionPerformed

        String maS = txtMaSach.getText();
        String ten = txtNguoiThue.getText();
        String ngay = txtNgayThue.getText();
        int tg = Integer.parseInt(txtThoiGianThue.getText());
        if (txtHinhThuc.getSelectedIndex() == 0) {
            if (dss.TimKiemMa(maS) != null) {
                int result = JOptionPane.showConfirmDialog(null, "Xác nhận thuê sách có mã: " + maS, "Xác nhận", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    Sach s = dss.TimKiemMa(maS);
                    JOptionPane.showMessageDialog(null, "Thuê sách "+ s.maSach + ": " + s.tenSach+ " thành công");
                    quanli.muon.add(new MuonSachTheoNgay(quanli.MaN(), ten, s, ngay, tg));
                    dss.xoaSachTheoMa(maS);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sách cần thuê không có trong thư viện");
            }

        } else {
            if (dss.TimKiemMa(maS) != null) {
                int result = JOptionPane.showConfirmDialog(null, "Xác nhận thuê sách có mã: " + maS, "Xác nhận", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    Sach s = dss.TimKiemMa(maS);
                    JOptionPane.showMessageDialog(null, "Thuê sách "+ s.maSach + ": " + s.tenSach+ " thành công");
                    quanli.muon.add(new MuonSachTheoGio(quanli.MaN(), ten, s, ngay, tg));
                    dss.xoaSachTheoMa(maS);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sách cần thuê không có trong thư viện");
            }
        }
        removeTable();
        tab.setColumnIdentifiers(new Object[]{"Mã Người Thuê", "Mã Sách", "Tên Sách", "Ngày Thuê", "Tiền Thuê"});
            for (MuonSach x : quanli.muon) {
                tab.addRow(new Object[]{x.maDG, x.sach.maSach, x.sach.tenSach, x.ngayMuon, x.TienThue()});
            }
        
    }//GEN-LAST:event_btnThueActionPerformed

    private void btnXemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemSachActionPerformed
        tab.setColumnIdentifiers(new Object[]{"Mã Sách", "Tên Sách", "Thể Loại", "Tác Giả", "Số Trang"});
        removeTable();
        for (Sach x : dss.a) {
            tab.addRow(new Object[]{x.maSach, x.tenSach, x.chuyendoi(), x.tacGia, x.soTrang});
        }
    }//GEN-LAST:event_btnXemSachActionPerformed

    private void btnXemDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDanhSachActionPerformed
        if (quanli.muon.size() == 0) {
            int result = JOptionPane.showConfirmDialog(null, "Danh sách trống. Bạn có muốn thuê sách???", "Xác nhận", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                txtMaSach.requestFocus();
            }
        } else {
            removeTable();
            tab.setColumnIdentifiers(new Object[]{"Mã Người Thuê", "Mã Sách", "Tên Sách", "Ngày Thuê", "Tiền Thuê"});
            for (MuonSach x : quanli.muon) {
                tab.addRow(new Object[]{x.maDG, x.sach.maSach, x.sach.tenSach, x.ngayMuon, x.TienThue()});
            }
        }
    }//GEN-LAST:event_btnXemDanhSachActionPerformed

    private void txtThoiGianThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThoiGianThueActionPerformed

    }//GEN-LAST:event_txtThoiGianThueActionPerformed

    private void txtThoiGianThueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThoiGianThueKeyReleased

        int thue = Integer.parseInt(txtThoiGianThue.getText());
        if (txtHinhThuc.getSelectedIndex() == 0) {
            //chọn theo ngày
            txtGiaTien.setText(String.valueOf(new MuonSachTheoNgay(thue).TienThue()) + 'đ');
        } else {
            txtGiaTien.setText(String.valueOf(new MuonSachTheoGio(thue).TienThue()) + 'đ');
        }
        if(isOk()){
            btnThue.setEnabled(true);
        }
        
    }//GEN-LAST:event_txtThoiGianThueKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double sum = 0;
        for (MuonSach x : quanli.muon) {
            sum = sum + x.TienThue();
        }
        JOptionPane.showMessageDialog(null, "Tổng số tiền thuê sách: " + sum);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtHinhThucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtHinhThucItemStateChanged
        if (!txtThoiGianThue.getText().equals("")) {
            int thue = Integer.parseInt(txtThoiGianThue.getText());
            if (txtHinhThuc.getSelectedIndex() == 0) {
                //chọn theo ngày
                txtGiaTien.setText(String.valueOf(new MuonSachTheoNgay(thue).TienThue()) + 'đ');
            } else {
                txtGiaTien.setText(String.valueOf(new MuonSachTheoGio(thue).TienThue()) + 'đ');
            }
        }
    }//GEN-LAST:event_txtHinhThucItemStateChanged

    private void txtHinhThucPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtHinhThucPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHinhThucPropertyChange

    private void txtThoiGianThueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThoiGianThueKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThoiGianThueKeyTyped

    private void txtThoiGianThueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThoiGianThueKeyPressed
        if (isOk()) {
            btnThue.setEnabled(true);
        }
    }//GEN-LAST:event_txtThoiGianThueKeyPressed

    private void txtMaSachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaSachKeyPressed
           // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachKeyPressed

    private void txtNguoiThueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNguoiThueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguoiThueKeyPressed

    private void txtNgayThueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayThueKeyPressed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayThueKeyPressed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienMuonSach().setVisible(true);
            }
        });
    }

    public void removeTable() {
        tab.setRowCount(0);
    }

    public boolean isOk() {
        if (txtMaSach.getText().equals("")) {
            return false;
        }
        if (txtNguoiThue.getText().equals("")) {
            return false;
        }
        if (txtNgayThue.getText().equals("")) {
            return false;
        }
        if (txtThoiGianThue.getText().equals("")) {
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThue;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXemDanhSach;
    private javax.swing.JButton btnXemSach;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBangThue;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JComboBox<String> txtHinhThuc;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNgayThue;
    private javax.swing.JTextField txtNguoiThue;
    private javax.swing.JFormattedTextField txtThoiGianThue;
    // End of variables declaration//GEN-END:variables
}