package com.tcsorcs.trailsapp.helpers;

/**
 * Contains methods and variables related to Segments
 */
public class Segment {

    private int segmentId;
    private String pointA;
    private String pointB;
    private double distance;

    public Segment (int segId, String firstPoint, String secondPoint, double segmentDistance){
        segmentId = segId;
        pointA = firstPoint;
        pointB = secondPoint;
        distance = segmentDistance;
    }

    //returns segmentId
    public int getSegmentId(){
        return segmentId;
    }

    //returns first point
    public String getFirstPoint(){
        return pointA;
    }

    //returns second point
    public String getSecondPoint(){
        return pointB;
    }

    //returns distance
    public double getSegmentDistance(){
        return distance;
    }

    //returns point in segment that is not the given point, or "NullPoint" if given point is not in the segment
    public String getOtherPoint(String somePoint){
        if (somePoint.equals(pointA)){
            return pointB;
        } else if (somePoint.equals(pointB)){
            return pointA;
        } else {
            return "NullPoint";
        }
    }

    //Returns true if this segment has both points, false else
    public boolean segmentHasPoints(String aPoint, String bPoint){
        if (aPoint.equals(pointA) && bPoint.equals(pointB)){
            return true;
        } else if (aPoint.equals(pointB) && bPoint.equals(pointA)){
            return true;
        } else {
            return false;
        }
    }
}
