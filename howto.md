git clone https://github.com/MikleAKA/KotlinAsFirst2020.git  
cd KotlinAsFirst2020  
git remote add upstream-my https://github.com/MikleAKA/KotlinAsFirst2021.git  
git fetch upstream-my  
git checkout backport  
git cherry-pick d535f359...FETCH_HEAD  
git remote add upstream-theirs https://github.com/VIN0GR4D/KotlinAsFirst2021.git  
git fetch upstream-theirs  
git checkout master  
git merge backport upstream-theirs/master  
git status  
*conflict resolution*  
git status  
git add *  
git merge --continue  
type nul > remotes  
git remote -v  
git add .  
git commit -m "conflict solved"  
git push  
type nul > howto.md  
git add .  
git commit -m "howtodo"  
git push  
