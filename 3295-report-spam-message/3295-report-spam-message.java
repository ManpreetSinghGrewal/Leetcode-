class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set = new HashSet<>();
        for(String bw : bannedWords){
            set.add(bw);
        }
        int count = 0;
        for(int i=0;i<message.length;i++){
            if(set.contains(message[i])){
                count++;
                if(count==2){
                    return true;
                }
            }
        }
        return false;
    }
}