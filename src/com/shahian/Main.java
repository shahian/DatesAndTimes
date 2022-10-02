package com.shahian;

import java.time.*;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        clock();
        localDateTime();
        zonesAndDate();
        comparingDates();
        formatingDate();
        peroid();
        duration();
        changingDateAndTime();
        convertingDates();
    }

    private static void convertingDates() {
        Date date = new Date(121, 12, 1);
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime);
        Calendar calendar=Calendar.getInstance();
        LocalDateTime localDateTime1=calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime1);
    }

    private static void changingDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        //plus add minute methode
        LocalDateTime localDateTime1 = localDateTime.plusMinutes(7);
        LocalDateTime localDateTime2 = localDateTime.plusHours(7);
        LocalDateTime localDateTime3 = localDateTime.plusDays(7);
        LocalDateTime localDateTime5 = localDateTime.plusWeeks(7);
        LocalDateTime localDateTime4 = localDateTime.plusMonths(7);
        LocalDateTime localDateTime6 = localDateTime.plusYears(7);
        System.out.println("localDateTime for now : " + localDateTime);
        System.out.println("localDateTime for minutes :" + localDateTime1);
        System.out.println("localDateTime for hours : " + localDateTime2);
        System.out.println("localDateTime for days : " + localDateTime3);
        System.out.println("localDateTime for  Week : " + localDateTime4);
        System.out.println("localDateTime for Month : " + localDateTime5);
        System.out.println("localDateTime for Year : " + localDateTime6);
        LocalDateTime localDateTime8 = localDateTime.plus(Period.ofWeeks(1));
        System.out.println("localDateTime for Period Methode : " + localDateTime8);
        // with method
        LocalDateTime localDateTime7 = localDateTime.withMonth(1);
        System.out.println("localDateTime for with Methode : " + localDateTime7);
        LocalDateTime localDateTime9 = localDateTime.minus(Duration.ofHours(2));
        System.out.println("localDateTime for Duration Methode : " + localDateTime9);
    }

    private static void duration() {
        Duration duration = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(duration);
        Duration duration1 = Duration.ofHours(5);
        System.out.println(duration1);

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(18, 5);
        Duration duration2 = Duration.between(localTime, localTime1);
        System.out.println(duration2);
    }

    private static void peroid() {
        Period period = Period.of(1, 1, 1);
        System.out.println(period);
        Period periodDay = Period.ofDays(100);
        Period periodMonth = Period.ofMonths(12);
        Period periodWeek = Period.ofWeeks(48);
        Period periodYear = Period.ofYears(50);
        System.out.println(periodDay);
        System.out.println(periodMonth);
        System.out.println(periodWeek);
        System.out.println(periodYear);
        LocalDate localDate = LocalDate.of(2021, 5, 3);
        LocalDate localDate1 = LocalDate.now();
        Period period1 = Period.between(localDate, localDate1);
        System.out.println(period1);
        System.out.println(period1.getDays());
        System.out.println(period1.getMonths());
        System.out.println(period1.getYears());
        long nrOfdayBetweenTheDates = ChronoUnit.DAYS.between(localDate, localDate1);
        long nrOfMONTHSBetweenTheDates = ChronoUnit.MONTHS.between(localDate, localDate1);
        System.out.println(nrOfdayBetweenTheDates);
        System.out.println(nrOfMONTHSBetweenTheDates);
    }

    private static void formatingDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String formatedDate = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime);
        String formatedDateBasic = DateTimeFormatter.BASIC_ISO_DATE.format(localDateTime);
        System.out.println(formatedDate);
        System.out.println(formatedDateBasic);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtf.format(localDateTime));
        String formatStyleMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(localDateTime);
        System.out.println(formatStyleMedium);
    }

    private static void comparingDates() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 10, 2, 9, 20);
        System.out.println(localDateTime.compareTo(localDateTime1));
        System.out.println("is after : " + localDateTime.isAfter(localDateTime1));
        System.out.println("is befor : " + localDateTime.isBefore(localDateTime1));
        System.out.println("is equal : " + localDateTime.isEqual(localDateTime1));
    }

    private static void zonesAndDate() {
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }
        System.out.println("******************");
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId1 = ZoneId.of(zoneId);
            String zoneIdDisplayName = zoneId1.getDisplayName(TextStyle.FULL, Locale.US);
            System.out.println(zoneId + " : " + zoneIdDisplayName);
        }
        ZoneId zoneId = ZoneId.of("US/Pacific");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime1);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now();
        System.out.println(zonedDateTime2.getZone());

    }

    private static void localDateTime() {
        //times
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1985, 3, 21);
        LocalDate ld3 = LocalDate.of(1985, Month.MARCH, 21);
        System.out.println(ld1);
        System.out.println(ld3);
        System.out.println(ld3);

        //localTimes
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(10, 20);
        LocalTime lt3 = LocalTime.of(10, 20, 33, 25);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);

        //localDateTimes
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(1985, 3, 21, 4, 50);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);

        //monthDay
        MonthDay monthDay = MonthDay.now();
        MonthDay monthDay1 = MonthDay.of(3, 21);
        LocalDate newlocalDate = monthDay1.atYear(1985);
        System.out.println(newlocalDate);

        //yearMonth
        YearMonth yearMonth = YearMonth.now();
        LocalDate yearMonthLocalDate = yearMonth.atDay(21);
        System.out.println(yearMonthLocalDate);
    }

    private static void clock() {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        Instant instant = clock.instant();
        System.out.println(instant);

        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());

        Clock clock2 = Clock.offset(clock, Duration.ofHours(10));
        System.out.println(clock2.instant());
    }

}
