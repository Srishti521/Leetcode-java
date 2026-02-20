class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> on = new HashSet<>();

        for(int i =0; i<bulbs.size(); i++){
            int bulb = bulbs.get(i);
            
        if(on.contains(bulb)){
            on.remove(bulb); //toggle off
        } else {
            on.add(bulb);
          }
        }
        List<Integer> result = new ArrayList<>(on);
        Collections.sort(result);
        return result;
    }
}
