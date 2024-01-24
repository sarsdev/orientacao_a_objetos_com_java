package _05HandsOn_Pontuacao;

public class CalculadoraBonus {
	
	public int bonusDoDia = 1;
	
	public int bonus(Usuario u) {
		return this.bonusDoDia * (u.vip ? 5 : 1);
	}
}
