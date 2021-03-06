package academy.learnprogramming;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width<= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double area = width * height;

        double bucketsNeeded = Math.ceil(area/areaPerBucket);

        int buckets = (int)bucketsNeeded - extraBuckets;

        return buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<= 0 || height <= 0 || areaPerBucket <= 0 ) return -1;

        double area = width * height;

        double bucketsNeeded = Math.ceil(area/areaPerBucket);

        int buckets = (int)bucketsNeeded;

        return buckets;

    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <= 0 || areaPerBucket <= 0) return -1;

        double bucketsNeeded = Math.ceil(area/areaPerBucket);

        int buckets = (int)bucketsNeeded;
        return buckets;
    }
}
