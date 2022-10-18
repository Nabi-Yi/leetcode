class Solution {
    public int maximumPopulation(int[][] logs) {
        //let the first year the minimum value of birth_i. or 1950.
        int minYear = 1950;
        int maxYear = 2050;
        int maxPop = 0;
        int pop = 0;
        int maxPopYear = 1950;
        for(int i = minYear ; i<=maxYear; i++){
            for(int j = 0; j<logs.length;j++){
                if(logs[j][0]==i) pop++;
                if(logs[j][1]==i) pop--;   
            }
            if(pop > maxPop){
            maxPop = pop;
            maxPopYear = i;
            }     
        }
        return maxPopYear;
      
    }
}
        