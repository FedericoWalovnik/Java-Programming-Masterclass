package com.company;

public class PaintJob {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets){
        double buckets=-1;
        if(width>0&&height>0&&areaPerBucket>0&&extraBuckets>=0){
            buckets = Math.ceil(((height * width) / areaPerBucket));
            buckets = (int)buckets-extraBuckets;
        }
        return (int)buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        double buckets=-1;
        if(width>0&&height>0&&areaPerBucket>0){
            buckets = Math.ceil(((height * width) / areaPerBucket));
        }
        return (int)buckets;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        double buckets=-1;
        if(area>0&&areaPerBucket>0){
            buckets = Math.ceil((area / areaPerBucket));
        }
        return (int)buckets;
    }

}
