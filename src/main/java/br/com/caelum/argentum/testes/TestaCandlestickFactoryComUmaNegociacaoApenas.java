package br.com.caelum.argentum.testes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactoryComUmaNegociacaoApenas {
	public static void main(String[] args){
		Calendar data = Calendar.getInstance();
		data.set(2016, Calendar.APRIL, 13);
		
		Negociacao negociacao = new Negociacao(10, 100, data);
		List<Negociacao> negociacoes = Arrays.asList(negociacao);
		CandlestickFactory factory = new CandlestickFactory();
		Candlestick candle = factory.constroiCandleParaData(data, negociacoes);
		
		System.out.println("Abertura  : "+candle.getAbertura());
		System.out.println("Fechamento: "+candle.getFechamento());
		System.out.println("Maximo    : "+candle.getMaximo());
		System.out.println("Minimo    : "+candle.getMinimo());
		System.out.println("Volume    : "+candle.getVolume());
		System.out.println("Data      : "+candle.getData());
				
		
	}

}
