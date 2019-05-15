package QueOutfit.ManigeApiAccuWeather;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

    public class DTODatosClimaticos {

        @SerializedName("DateTime")
        @Expose
        private String dateTime;
        @SerializedName("EpochDateTime")
        @Expose
        private Integer epochDateTime;
        @SerializedName("WeatherIcon")
        @Expose
        private Integer weatherIcon;
        @SerializedName("IconPhrase")
        @Expose
        private String iconPhrase;
        @SerializedName("IsDaylight")
        @Expose
        private Boolean isDaylight;
        @SerializedName("Temperature")
        @Expose
        private DTOTemperatureAccuWeather temperature;

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public Integer getEpochDateTime() {
            return epochDateTime;
        }

        public void setEpochDateTime(Integer epochDateTime) {
            this.epochDateTime = epochDateTime;
        }

        public Integer getWeatherIcon() {
            return weatherIcon;
        }

        public void setWeatherIcon(Integer weatherIcon) {
            this.weatherIcon = weatherIcon;
        }

        public String getIconPhrase() {
            return iconPhrase;
        }

        public void setIconPhrase(String iconPhrase) {
            this.iconPhrase = iconPhrase;
        }

        public Boolean getIsDaylight() {
            return isDaylight;
        }

        public void setIsDaylight(Boolean isDaylight) {
            this.isDaylight = isDaylight;
        }

        public DTOTemperatureAccuWeather getTemperature() {
            return temperature;
        }

        public void setTemperature(DTOTemperatureAccuWeather temperature) {
            this.temperature = temperature;
        }

        public int getHour(){
            try {
                String pattern = "yyyy-MM-dd'T'HH:mm:ssZ";
                LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormat.forPattern(pattern));
                return localDateTime.hourOfDay().get();
            }
            catch(Exception e){
                throw new RuntimeException();

            }
        }


    }


