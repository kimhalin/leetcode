class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int answer = 0;

        for (int i = 0; i < energy.length; i++) {
            if (energy[i] >= initialEnergy) {
                answer += (energy[i] - initialEnergy + 1);
                initialEnergy += (energy[i] - initialEnergy + 1);
            }
            if (experience[i] >= initialExperience) {
                answer += (experience[i] - initialExperience + 1);
                initialExperience += (experience[i] - initialExperience + 1);
            }
            
            initialEnergy -= energy[i];
            initialExperience += experience[i];
        }

        return answer;
    }
}