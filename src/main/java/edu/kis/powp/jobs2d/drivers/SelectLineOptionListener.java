package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.features.DriverFeature;

public class SelectLineOptionListener implements ActionListener{
    
    private LineDrawerAdapter lineDrawerAdapter;
    private ILine iLine;

    public SelectLineOptionListener(LineDrawerAdapter lineDrawerAdapter, ILine iLine){
        this.iLine = iLine;
        this.lineDrawerAdapter = lineDrawerAdapter;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        lineDrawerAdapter.setILine(iLine);
        DriverFeature.getDriverManager().setCurrentDriver(lineDrawerAdapter);
        DriverFeature.updateDriverInfo();
    }
}
