package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver{

    private int x_0 = 0, y_0 = 0;
    private DrawPanelController drawPanelController;
    private ILine iLine;
    
    public LineDrawerAdapter(ILine chosenILine, DrawPanelController drawPanelController){
        this.drawPanelController = drawPanelController;
        if(chosenILine == LineFactory.getDottedLine()){
            this.iLine = LineFactory.getDottedLine();
        }else if(chosenILine == LineFactory.getSpecialLine()){
            this.iLine = LineFactory.getSpecialLine();
        }else{
            this.iLine = LineFactory.getBasicLine();
        }
    }

    public void setILine(ILine iLine){
        this.iLine = iLine;
    }
    public ILine getILine(){
        return this.iLine;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x_0 = x;
        this.y_0 = y;
    }

    @Override
    public void operateTo(int x, int y) {
        iLine.setStartCoordinates(x_0, y_0);
        iLine.setEndCoordinates(x, y);

        drawPanelController.drawLine(iLine);
        setPosition(x, y);
    }
    
    @Override
    public String toString(){
        if(iLine == LineFactory.getBasicLine()){
            return "Basic Line";
        }else if(iLine == LineFactory.getDottedLine()){
            return "Dotted Line";
        }else{
            return "Special Line";
        }
    }
}
