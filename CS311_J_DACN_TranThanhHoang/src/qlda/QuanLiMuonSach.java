
package qlda;

import java.util.ArrayList;

public class QuanLiMuonSach {
    ArrayList<MuonSach> muon = new ArrayList<MuonSach>();
    public String randomMa(){
        return "DG"+ Math.round(Math.random()*100);
    }
    public boolean isMa(String ma){
        for(MuonSach x: muon){
            if(x.getMaDG() == ma){
                return false;
            }
        }
        return true;
    }
    public String MaN(){
        if(muon.size() ==0){
            return randomMa();
        }
        String m= randomMa();
        while(isMa(m)==false){
            m = randomMa();
        }
        return m;
    }
}
