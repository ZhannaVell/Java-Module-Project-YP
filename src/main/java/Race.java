public class Race {
    private Car leader;
    private int leaderDistance = 0;

    public void checkLeader(Car newCar) {
        int newCarDistance = newCar.calculateDistance();
        if (leader == null) {
            leader = newCar;
            leaderDistance = newCarDistance;
        } else {
            if (newCarDistance > leaderDistance) {
                leader = newCar;
                leaderDistance = newCarDistance;
            }
        }
    }

    public String getLeaderName() {
            if (leader != null) {
                return leader.name;
            }
            return "Нет победителя";
        }
}
