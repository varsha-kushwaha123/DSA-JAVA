class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hrs=0;
        int tenergy=0;
        int energyreq=0;
        for(int i=0;i<energy.length;i++){
            tenergy+=energy[i];
        }
        if(initialEnergy<=tenergy){
            energyreq=tenergy+1;
            hrs=energyreq-initialEnergy;
        }
       
        for(int i=0;i<experience.length;i++){
            if(experience[i]>=initialExperience){
                hrs+=(experience[i]+1)-initialExperience;
                initialExperience=experience[i]+1;
                
            }
            
                initialExperience+=experience[i];
            

           
        }
        return hrs;

    }
        
 }
