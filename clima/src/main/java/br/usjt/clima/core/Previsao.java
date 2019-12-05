package br.usjt.clima.core;

import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Previsao {
	long dt;
	public void setDt(long dt) {
		this.dt = dt;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	public void setWeathers(List<Weather> weathers) {
		this.weathers = weathers;
	}
	@JsonAlias("main")
	Temperature temperature;
	@JsonAlias("weather")
	List<Weather> weathers;
	public long getDt() {
		return dt;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public List<Weather> getWeathers() {
		return weathers;
	}


}
