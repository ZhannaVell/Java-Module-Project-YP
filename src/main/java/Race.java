public class Race {
        private Car leader;
        private int leaderDistance = 0;
        void checkLeader(Car newCar){
            int newCarDistance = newCar.calculateDistance();
            if(leader == null) {
                leader = newCar;
                leaderDistance = newCarDistance;
            }else{
                if(newCarDistance > leaderDistance) {
                    leader = newCar;
                    leaderDistance = newCarDistance;

                }

            }
        }



    String getLeaderName(){
        if(leader !=null){
            return leader.getName();
        }
        return "Нет победителя";
    }
}
