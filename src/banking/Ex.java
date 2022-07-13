package banking;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ex{
    public static void main(String[] args){
        int totalEmployee = 0;
        int upNum = 0;
        Scanner sc = new Scanner(System.in);
        int[] upNumArr = new int[100000];

        totalEmployee = sc.nextInt();


        for(int i=0; i<totalEmployee; i++){
            upNumArr[i] = sc.nextInt();
        }




        Company company = new Company(upNumArr);

        for(int i=0; i<totalEmployee; i++){
            company.createEmployee(upNumArr[i], i+1);
        }

        System.out.println(company.getJobTime());
        System.out.println(totalEmployee - company.getFireNumber());
    }
}

class Company{
    private HashMap<Integer, Employee> employeeList = new HashMap<Integer, Employee>();
    private int maxNodeLevel = 0;
    private int maxNodeEmployeeNumber = 0;
    private int[] upNumList;

    public Company(int []arr){
        upNumList = arr;
    }

    public void createEmployee(int upNum, int myNum){

        if(employeeList.containsKey(myNum)==false){
            employeeList.put(myNum, new Employee(upNum, myNum));
        }
        if(upNum == -1){
            employeeList.get(myNum).setNodeLevel(1);
        }else{
            if(employeeList.containsKey(upNum)==true){
                employeeList.get(myNum).setNodeLevel(employeeList.get(upNum).getNodeLevel() + 1);
            }else{
                createEmployee(upNumList[upNum-1], upNum);
                employeeList.get(myNum).setNodeLevel(employeeList.get(upNum).getNodeLevel()+1);

            }
        }
        setMaxNodeLevel(employeeList.get(myNum).getNodeLevel());
    }

    public int getJobTime(){
        return maxNodeLevel;
    }

    public int getFireNumber(){
        int employeeCount = 0;
        int needEmployeeCount = 0;
        int sulplusEmployeeCount = 0;

        for(int i=maxNodeLevel; i>0; i--){
            for(Entry<Integer, Employee> entrySet: employeeList.entrySet()){
                if(entrySet.getValue().getNodeLevel() == i){
                    employeeCount++;
                }
            }
            if(i==maxNodeLevel){
                needEmployeeCount = employeeCount;
            }else{
                if(employeeCount>needEmployeeCount){
                    while(sulplusEmployeeCount > 0 && employeeCount>needEmployeeCount){
                        employeeCount--;
                        sulplusEmployeeCount--;
                    }
                    int currentTrun = maxNodeLevel - i + 1;
                    int remainingNode = employeeCount - needEmployeeCount;
                    if(remainingNode>0){
                        float addNeedEmployee = (float)remainingNode / (float)currentTrun;
                        int addNeedEmployeeCount = (int)addNeedEmployee;
                        if(addNeedEmployeeCount == 0){
                            sulplusEmployeeCount += currentTrun - remainingNode;
                            needEmployeeCount += 1;

                        }else{
                            if(addNeedEmployee - addNeedEmployeeCount > 0){
                                needEmployeeCount += (int)((remainingNode / currentTrun)+0.5);
                                sulplusEmployeeCount += (int)((remainingNode / currentTrun)+0.5) - 1;
                            }else if(addNeedEmployee - addNeedEmployeeCount ==0){
                                needEmployeeCount += (int)((remainingNode / currentTrun));
                            }
                        }
                    }
                }else{
                    sulplusEmployeeCount += needEmployeeCount - employeeCount;
                }

            }
            employeeCount = 0;
        }
        return needEmployeeCount;
    }

    private void setMaxNodeLevel(int nodeLevel){
        if(this.maxNodeLevel < nodeLevel){
            this.maxNodeLevel = nodeLevel;
        }
    }
}

class Employee{
    private int upNum;
    private int myNum;
    private int nodeLevel;

    public Employee(int upNum, int myNum){
        this.upNum = upNum;
        this.myNum = myNum;
    }

    public int getUpNum(){
        return upNum;
    }

    public int getMyNum(){
        return myNum;
    }

    public int getNodeLevel(){
        return nodeLevel;
    }

    public void setNodeLevel(int nodeLvel){
        this.nodeLevel=nodeLevel;
    }
}