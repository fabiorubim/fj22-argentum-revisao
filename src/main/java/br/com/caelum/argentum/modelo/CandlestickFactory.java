package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.List;
import br.com.caelum.argentum.modelo.Candlestick;

public class CandlestickFactory {
	public Candlestick constroiCandleParaData(Calendar data, List<Negociacao> negociacoes){
		//double abertura = negociacoes.get(0).getPreco();
		double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		//double fechamento = negociacoes.get(negociacoes.size()-1).getPreco();
		double fechamento = negociacoes.isEmpty() ? 0 : negociacoes.get(negociacoes.size()-1).getPreco();
		
		//double minimo = abertura;
		double minimo = Double.MAX_VALUE;
		//double maximo = abertura;
		double maximo = 0;
		double volume = 0;
		
		for(int i=0;i<=negociacoes.size()-1;i++){
			if (negociacoes.get(i).getPreco() > maximo){
				maximo = negociacoes.get(i).getPreco();
			}
			if (negociacoes.get(i).getPreco() < minimo){
				minimo = negociacoes.get(i).getPreco();
			}
			volume += negociacoes.get(i).getVolume();
		}
		
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
	}

}
