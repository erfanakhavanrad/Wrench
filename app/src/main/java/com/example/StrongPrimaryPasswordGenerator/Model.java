package com.example.StrongPrimaryPasswordGenerator;

import java.util.List;

public class Model {

    /**
     * code : 200
     * status : OK
     * data : {"timings":{"Fajr":"04:55","Sunrise":"06:12","Dhuhr":"13:02","Asr":"16:46","Sunset":"19:51","Maghrib":"19:51","Isha":"21:09","Imsak":"04:45","Midnight":"01:02"},"date":{"readable":"01 May 2020","timestamp":"1588319244","hijri":{"date":"08-09-1441","format":"DD-MM-YYYY","day":"08","weekday":{"en":"Al Juma'a","ar":"الجمعة"},"month":{"number":9,"en":"Ramaḍān","ar":"رَمَضان"},"year":"1441","designation":{"abbreviated":"AH","expanded":"Anno Hegirae"},"holidays":[]},"gregorian":{"date":"01-05-2020","format":"DD-MM-YYYY","day":"01","weekday":{"en":"Friday"},"month":{"number":5,"en":"May"},"year":"2020","designation":{"abbreviated":"AD","expanded":"Anno Domini"}}},"meta":{"latitude":35.6891975,"longitude":51.3889736,"timezone":"Asia/Tehran","method":{"id":2,"name":"Islamic Society of North America (ISNA)","params":{"Fajr":15,"Isha":15}},"latitudeAdjustmentMethod":"ANGLE_BASED","midnightMode":"STANDARD","school":"STANDARD","offset":{"Imsak":0,"Fajr":0,"Sunrise":0,"Dhuhr":0,"Asr":0,"Maghrib":0,"Sunset":0,"Isha":0,"Midnight":0}}}
     */

    int code;
    String status;
    DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * timings : {"Fajr":"04:55","Sunrise":"06:12","Dhuhr":"13:02","Asr":"16:46","Sunset":"19:51","Maghrib":"19:51","Isha":"21:09","Imsak":"04:45","Midnight":"01:02"}
         * date : {"readable":"01 May 2020","timestamp":"1588319244","hijri":{"date":"08-09-1441","format":"DD-MM-YYYY","day":"08","weekday":{"en":"Al Juma'a","ar":"الجمعة"},"month":{"number":9,"en":"Ramaḍān","ar":"رَمَضان"},"year":"1441","designation":{"abbreviated":"AH","expanded":"Anno Hegirae"},"holidays":[]},"gregorian":{"date":"01-05-2020","format":"DD-MM-YYYY","day":"01","weekday":{"en":"Friday"},"month":{"number":5,"en":"May"},"year":"2020","designation":{"abbreviated":"AD","expanded":"Anno Domini"}}}
         * meta : {"latitude":35.6891975,"longitude":51.3889736,"timezone":"Asia/Tehran","method":{"id":2,"name":"Islamic Society of North America (ISNA)","params":{"Fajr":15,"Isha":15}},"latitudeAdjustmentMethod":"ANGLE_BASED","midnightMode":"STANDARD","school":"STANDARD","offset":{"Imsak":0,"Fajr":0,"Sunrise":0,"Dhuhr":0,"Asr":0,"Maghrib":0,"Sunset":0,"Isha":0,"Midnight":0}}
         */

        TimingsBean timings;
        DateBean date;
        MetaBean meta;

        public TimingsBean getTimings() {
            return timings;
        }

        public void setTimings(TimingsBean timings) {
            this.timings = timings;
        }

        public DateBean getDate() {
            return date;
        }

        public void setDate(DateBean date) {
            this.date = date;
        }

        public MetaBean getMeta() {
            return meta;
        }

        public void setMeta(MetaBean meta) {
            this.meta = meta;
        }

        public static class TimingsBean {
            /**
             * Fajr : 04:55
             * Sunrise : 06:12
             * Dhuhr : 13:02
             * Asr : 16:46
             * Sunset : 19:51
             * Maghrib : 19:51
             * Isha : 21:09
             * Imsak : 04:45
             * Midnight : 01:02
             */

            String Fajr;
            String Sunrise;
            String Dhuhr;
            String Asr;
            String Sunset;
            String Maghrib;
            String Isha;
            String Imsak;
            String Midnight;

            public String getFajr() {
                return Fajr;
            }

            public void setFajr(String Fajr) {
                this.Fajr = Fajr;
            }

            public String getSunrise() {
                return Sunrise;
            }

            public void setSunrise(String Sunrise) {
                this.Sunrise = Sunrise;
            }

            public String getDhuhr() {
                return Dhuhr;
            }

            public void setDhuhr(String Dhuhr) {
                this.Dhuhr = Dhuhr;
            }

            public String getAsr() {
                return Asr;
            }

            public void setAsr(String Asr) {
                this.Asr = Asr;
            }

            public String getSunset() {
                return Sunset;
            }

            public void setSunset(String Sunset) {
                this.Sunset = Sunset;
            }

            public String getMaghrib() {
                return Maghrib;
            }

            public void setMaghrib(String Maghrib) {
                this.Maghrib = Maghrib;
            }

            public String getIsha() {
                return Isha;
            }

            public void setIsha(String Isha) {
                this.Isha = Isha;
            }

            public String getImsak() {
                return Imsak;
            }

            public void setImsak(String Imsak) {
                this.Imsak = Imsak;
            }

            public String getMidnight() {
                return Midnight;
            }

            public void setMidnight(String Midnight) {
                this.Midnight = Midnight;
            }
        }

        public static class DateBean {
            /**
             * readable : 01 May 2020
             * timestamp : 1588319244
             * hijri : {"date":"08-09-1441","format":"DD-MM-YYYY","day":"08","weekday":{"en":"Al Juma'a","ar":"الجمعة"},"month":{"number":9,"en":"Ramaḍān","ar":"رَمَضان"},"year":"1441","designation":{"abbreviated":"AH","expanded":"Anno Hegirae"},"holidays":[]}
             * gregorian : {"date":"01-05-2020","format":"DD-MM-YYYY","day":"01","weekday":{"en":"Friday"},"month":{"number":5,"en":"May"},"year":"2020","designation":{"abbreviated":"AD","expanded":"Anno Domini"}}
             */

            String readable;
            String timestamp;
            HijriBean hijri;
            GregorianBean gregorian;

            public String getReadable() {
                return readable;
            }

            public void setReadable(String readable) {
                this.readable = readable;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public HijriBean getHijri() {
                return hijri;
            }

            public void setHijri(HijriBean hijri) {
                this.hijri = hijri;
            }

            public GregorianBean getGregorian() {
                return gregorian;
            }

            public void setGregorian(GregorianBean gregorian) {
                this.gregorian = gregorian;
            }

            public static class HijriBean {
                /**
                 * date : 08-09-1441
                 * format : DD-MM-YYYY
                 * day : 08
                 * weekday : {"en":"Al Juma'a","ar":"الجمعة"}
                 * month : {"number":9,"en":"Ramaḍān","ar":"رَمَضان"}
                 * year : 1441
                 * designation : {"abbreviated":"AH","expanded":"Anno Hegirae"}
                 * holidays : []
                 */

                 String date;
                 String format;
                 String day;
                 WeekdayBean weekday;
                 MonthBean month;
                 String year;
                 DesignationBean designation;
                 List<?> holidays;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public String getDay() {
                    return day;
                }

                public void setDay(String day) {
                    this.day = day;
                }

                public WeekdayBean getWeekday() {
                    return weekday;
                }

                public void setWeekday(WeekdayBean weekday) {
                    this.weekday = weekday;
                }

                public MonthBean getMonth() {
                    return month;
                }

                public void setMonth(MonthBean month) {
                    this.month = month;
                }

                public String getYear() {
                    return year;
                }

                public void setYear(String year) {
                    this.year = year;
                }

                public DesignationBean getDesignation() {
                    return designation;
                }

                public void setDesignation(DesignationBean designation) {
                    this.designation = designation;
                }

                public List<?> getHolidays() {
                    return holidays;
                }

                public void setHolidays(List<?> holidays) {
                    this.holidays = holidays;
                }

                public static class WeekdayBean {
                    /**
                     * en : Al Juma'a
                     * ar : الجمعة
                     */

                    String en;
                    String ar;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getAr() {
                        return ar;
                    }

                    public void setAr(String ar) {
                        this.ar = ar;
                    }
                }

                public static class MonthBean {
                    /**
                     * number : 9
                     * en : Ramaḍān
                     * ar : رَمَضان
                     */

                    int number;
                    String en;
                    String ar;

                    public int getNumber() {
                        return number;
                    }

                    public void setNumber(int number) {
                        this.number = number;
                    }

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                    public String getAr() {
                        return ar;
                    }

                    public void setAr(String ar) {
                        this.ar = ar;
                    }
                }

                public static class DesignationBean {
                    /**
                     * abbreviated : AH
                     * expanded : Anno Hegirae
                     */

                    String abbreviated;
                    String expanded;

                    public String getAbbreviated() {
                        return abbreviated;
                    }

                    public void setAbbreviated(String abbreviated) {
                        this.abbreviated = abbreviated;
                    }

                    public String getExpanded() {
                        return expanded;
                    }

                    public void setExpanded(String expanded) {
                        this.expanded = expanded;
                    }
                }
            }

            public static class GregorianBean {
                /**
                 * date : 01-05-2020
                 * format : DD-MM-YYYY
                 * day : 01
                 * weekday : {"en":"Friday"}
                 * month : {"number":5,"en":"May"}
                 * year : 2020
                 * designation : {"abbreviated":"AD","expanded":"Anno Domini"}
                 */

               String date;
               String format;
               String day;
               WeekdayBeanX weekday;
               MonthBeanX month;
               String year;
               DesignationBeanX designation;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public String getDay() {
                    return day;
                }

                public void setDay(String day) {
                    this.day = day;
                }

                public WeekdayBeanX getWeekday() {
                    return weekday;
                }

                public void setWeekday(WeekdayBeanX weekday) {
                    this.weekday = weekday;
                }

                public MonthBeanX getMonth() {
                    return month;
                }

                public void setMonth(MonthBeanX month) {
                    this.month = month;
                }

                public String getYear() {
                    return year;
                }

                public void setYear(String year) {
                    this.year = year;
                }

                public DesignationBeanX getDesignation() {
                    return designation;
                }

                public void setDesignation(DesignationBeanX designation) {
                    this.designation = designation;
                }

                public static class WeekdayBeanX {
                    /**
                     * en : Friday
                     */

                    String en;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }
                }

                public static class MonthBeanX {
                    /**
                     * number : 5
                     * en : May
                     */

                     int number;
                     String en;

                    public int getNumber() {
                        return number;
                    }

                    public void setNumber(int number) {
                        this.number = number;
                    }

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }
                }

                public static class DesignationBeanX {
                    /**
                     * abbreviated : AD
                     * expanded : Anno Domini
                     */

                     String abbreviated;
                     String expanded;

                    public String getAbbreviated() {
                        return abbreviated;
                    }

                    public void setAbbreviated(String abbreviated) {
                        this.abbreviated = abbreviated;
                    }

                    public String getExpanded() {
                        return expanded;
                    }

                    public void setExpanded(String expanded) {
                        this.expanded = expanded;
                    }
                }
            }
        }

        public static class MetaBean {
            /**
             * latitude : 35.6891975
             * longitude : 51.3889736
             * timezone : Asia/Tehran
             * method : {"id":2,"name":"Islamic Society of North America (ISNA)","params":{"Fajr":15,"Isha":15}}
             * latitudeAdjustmentMethod : ANGLE_BASED
             * midnightMode : STANDARD
             * school : STANDARD
             * offset : {"Imsak":0,"Fajr":0,"Sunrise":0,"Dhuhr":0,"Asr":0,"Maghrib":0,"Sunset":0,"Isha":0,"Midnight":0}
             */

            double latitude;
            double longitude;
            String timezone;
            MethodBean method;
            String latitudeAdjustmentMethod;
            String midnightMode;
            String school;
            OffsetBean offset;

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public MethodBean getMethod() {
                return method;
            }

            public void setMethod(MethodBean method) {
                this.method = method;
            }

            public String getLatitudeAdjustmentMethod() {
                return latitudeAdjustmentMethod;
            }

            public void setLatitudeAdjustmentMethod(String latitudeAdjustmentMethod) {
                this.latitudeAdjustmentMethod = latitudeAdjustmentMethod;
            }

            public String getMidnightMode() {
                return midnightMode;
            }

            public void setMidnightMode(String midnightMode) {
                this.midnightMode = midnightMode;
            }

            public String getSchool() {
                return school;
            }

            public void setSchool(String school) {
                this.school = school;
            }

            public OffsetBean getOffset() {
                return offset;
            }

            public void setOffset(OffsetBean offset) {
                this.offset = offset;
            }

            public static class MethodBean {
                /**
                 * id : 2
                 * name : Islamic Society of North America (ISNA)
                 * params : {"Fajr":15,"Isha":15}
                 */

                int id;
                String name;
                ParamsBean params;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public ParamsBean getParams() {
                    return params;
                }

                public void setParams(ParamsBean params) {
                    this.params = params;
                }

                public static class ParamsBean {
                    /**
                     * Fajr : 15
                     * Isha : 15
                     */

                    int Fajr;
                    int Isha;

                    public int getFajr() {
                        return Fajr;
                    }

                    public void setFajr(int Fajr) {
                        this.Fajr = Fajr;
                    }

                    public int getIsha() {
                        return Isha;
                    }

                    public void setIsha(int Isha) {
                        this.Isha = Isha;
                    }
                }
            }

            public static class OffsetBean {
                /**
                 * Imsak : 0
                 * Fajr : 0
                 * Sunrise : 0
                 * Dhuhr : 0
                 * Asr : 0
                 * Maghrib : 0
                 * Sunset : 0
                 * Isha : 0
                 * Midnight : 0
                 */

                int Imsak;
                int Fajr;
                int Sunrise;
                int Dhuhr;
                int Asr;
                int Maghrib;
                int Sunset;
                int Isha;
                int Midnight;

                public int getImsak() {
                    return Imsak;
                }

                public void setImsak(int Imsak) {
                    this.Imsak = Imsak;
                }

                public int getFajr() {
                    return Fajr;
                }

                public void setFajr(int Fajr) {
                    this.Fajr = Fajr;
                }

                public int getSunrise() {
                    return Sunrise;
                }

                public void setSunrise(int Sunrise) {
                    this.Sunrise = Sunrise;
                }

                public int getDhuhr() {
                    return Dhuhr;
                }

                public void setDhuhr(int Dhuhr) {
                    this.Dhuhr = Dhuhr;
                }

                public int getAsr() {
                    return Asr;
                }

                public void setAsr(int Asr) {
                    this.Asr = Asr;
                }

                public int getMaghrib() {
                    return Maghrib;
                }

                public void setMaghrib(int Maghrib) {
                    this.Maghrib = Maghrib;
                }

                public int getSunset() {
                    return Sunset;
                }

                public void setSunset(int Sunset) {
                    this.Sunset = Sunset;
                }

                public int getIsha() {
                    return Isha;
                }

                public void setIsha(int Isha) {
                    this.Isha = Isha;
                }

                public int getMidnight() {
                    return Midnight;
                }

                public void setMidnight(int Midnight) {
                    this.Midnight = Midnight;
                }
            }
        }
    }
}
