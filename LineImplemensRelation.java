/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natasya_11juni2026;

/**
 *
 * @author LAB-SI-PC
 */

public class LineImplemensRelation implements Relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

  
    public LineImplemensRelation() {
    }

    public LineImplemensRelation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return length;
    }

    public boolean isGreater(Object a, Object b) {
        double aLen = ((LineImplemensRelation) a).getLength();
        double bLen = ((LineImplemensRelation) b).getLength();
        return (aLen > bLen);
    }

    public boolean isLess(Object a, Object b) {
        double aLen = ((LineImplemensRelation) a).getLength();
        double bLen = ((LineImplemensRelation) b).getLength();
        return (aLen < bLen);
    }

    public boolean isEqual(Object a, Object b) {
        double aLen = ((LineImplemensRelation) a).getLength();
        double bLen = ((LineImplemensRelation) b).getLength();
        return (aLen == bLen);
    }
}
