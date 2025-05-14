public class Team {

    public int id;
    public String name;
    public Player dt;
    public Player[] players = new Player[11];
    public String city;
    public String stadium;
    public int PlayerCount = 0;
    public void add(Player player) {
        if (PlayerCount < 11) {
            players[PlayerCount] = player;
            PlayerCount++;
        } else {
            System.out.println("el equipo esta completo");

        }
    }
    public void showteam(){
        System.out.println("\nEquipo:"+name+"("+stadium+")");
        for (int i =0; i<PlayerCount; i++) {
            System.out.println(players[i].toString());

        }
    }




}
