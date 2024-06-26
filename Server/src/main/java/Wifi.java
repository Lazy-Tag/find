public class Wifi implements Comparable<Wifi> {
    private final String name;
    int Rssi;
    public Wifi(String n, int r){
        name = n;
        Rssi = r;
    }

    public Wifi(String information){
        String[] info = information.split(" ");
        name = info[0];
        Rssi = Integer.parseInt(info[1]);
    }

    public String getName() {
        return name;
    }

    public int getRssi() {
        return Rssi;
    }

    public void setRssi(int r){
        Rssi += r;
    }

    public String toString(){
        return name + ' ' + Integer.toString(Rssi);
    }

    @Override
    public int compareTo(Wifi wifi){
        return this.Rssi - wifi.getRssi();
    }
}
