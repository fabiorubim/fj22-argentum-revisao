package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaPetrobras {
	public static void main(String args[]){
		
		Calendar data = Calendar.getInstance();
		data.set(2016, 10, 30);
		
		//Negociacao negociacao = new Negociacao(30, -1, data);
		//Negociacao negociacao = new Negociacao(30, 0, data);
		Negociacao negociacao = new Negociacao(30, 0, null);
		List<Negociacao> negociacoes = Arrays.asList(negociacao); 
		
		CandlestickFactory factory =  new CandlestickFactory();
		Candlestick candle = factory.constroiCandleParaData(data, negociacoes);
		
		System.out.println("Abertura    : "+candle.getAbertura());
		System.out.println("Fechamanento: "+candle.getFechamento());
		System.out.println("Minimo      : "+candle.getMinimo());
		System.out.println("Maximo      : "+candle.getMaximo());
		System.out.println("Volume      : "+candle.getVolume());
		System.out.println("Alta        : "+candle.isAlta());
		System.out.println("Baixa       : "+candle.isBaixa());
	}

}
