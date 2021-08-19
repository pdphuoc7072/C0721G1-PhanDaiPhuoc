package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch () {
    }
    public StopWatch (long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long getStartTime () {
        return startTime;
    }
    public long getEndTime () {
        return endTime;
    }
    public void start () {
        startTime = System.currentTimeMillis();
    }
    public void stop () {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        long millisecond = getEndTime() - getStartTime();
        return millisecond;
    }
}
