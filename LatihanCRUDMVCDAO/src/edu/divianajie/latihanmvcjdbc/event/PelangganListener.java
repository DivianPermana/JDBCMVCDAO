/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.divianajie.latihanmvcjdbc.event;

import edu.divianajie.latihanmvcjdbc.entity.Pelanggan;
import edu.divianajie.latihanmvcjdbc.model.PelangganModel;

/**
 *  Divian Ajie Permana - 10116551
 *  PBO-12
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
