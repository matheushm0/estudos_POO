#include<stdio.h>
#include<string.h>
int main(){
    char s[201], alf[26];
    int i, j, k, t, countS, espec[26], maior[26], count[26];
    scanf("%d", &t);
    
    for(i=0;i<26;i++){
        alf[i] = 'a' + i;
    }
    
    for(i=0;i<26;i++){
        count[i] = 0;
        maior[i] = 0;
        espec[i] = 0;
    }
    
    while(t--){
        scanf("%s", s);
    
    
        for(i=0;s[i] != '\0';i++){  
            if(s[i] >= 'A' && s[i] <= 'Z'){
                s[i] = s[i]+32;
            }
        }
        
        
            
        for(i=0;s[i] != '\0';i++){    
            for(k=0;k<26;k++){
                if(alf[k] == s[i]){
                    count[k]++;
                }
            }    
        }
        
        
        for(i=0;i<26;i++){
            if(count[i] > maior[0]){
                maior[0] = count[i];
            }
        }
               

        for(i=0, j=0;i<26;i++){
            if(count[i] == maior[0]){
                maior[0+j] = maior[0];
                espec[j] = count[i];
                j++;
            }
        }

 
         for(i=0;maior[i] != 0;i++){
                countS++;
            }
 
 
 
    }
    for(i=0;i<countS;i++){
        printf("A letra %c se repetiu %d vez(ez)\n", alf[espec[i]], maior[0]);
    }
    return 0;
}