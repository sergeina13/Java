package Ennum;

public enum DayOfWeek {
    Monday (40), Tuesday (32), Wednesday(24), Thursday(16),
    Friday(8), Saturday(0), Sunday(0);
    private int work;


    public int getWork() {
        return work;
    }

    DayOfWeek (int work) {
        this.work = work;
    }
}

class DayOfWeekMain {
    public static void main(final String[] args) {

        System.out.println(getWorkingHours(DayOfWeek.Tuesday)); // задаем на вход день недели
    }



    private static String getWorkingHours(DayOfWeek days) {
        String x;
        if (days.ordinal() >= 0 & days.ordinal() <= 4 ) {
            return x = ("Осталось работать "+ days.getWork() + " "+ "часов");

        } else return x ="ВЫХОДНЫЕ!!!!";
    }
}


