package homework.h01;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("***멋쟁이 전사처럼***");
        System.out.println("캐릭터 이름을 지어주세요.");
        String name = s.next();
        int hp = 100; // 내 에너지
        int damage = 0; // 내 피해량
        int enemyHp = 100; // 적군 에너지
        int enemyDamage = 0; // 적군 피해량
        int enemyAttack = 0;
        int enemyDefense = 0;
        int attack = 0;
        int defense = 0;
        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");

        while(true){
            System.out.println("어떤 행동을 하시겠습니까?");
            System.out.println("1) 공격 2) 방어 3) 40 HP 회복");
            int action = s.nextInt();

            // 적 행동 선택
            enemyDefense = 0;
            enemyAttack = (int)(Math.random() * 3);
            if (enemyAttack == 0) {
                enemyDefense = (int)(Math.random() * 3);
            }

            attack = 0;

            switch(action){
                case 1 -> { // 공격
                    System.out.println("어느 부위를 공격 하시겠습니까?");
                    System.out.println("1: 상체 | 2: 하체");
                    attack = s.nextInt();

                    // 적도 공격할 경우
                    if (enemyAttack != 0) {
                        damage = (int)(Math.random() * 20) + 10;
                        hp -= damage;
                        System.out.println("적에게 " + damage + "의 피해를 입었습니다.");
                    }

                    // 적이 공격을 방어했을 경우
                    if (attack == enemyDefense) {
                        enemyHp += 20;
                        System.out.println("적이 공격을 방어하였습니다. | 적 hp +20");
                    } else { // 적이 방어하지 못했을 경우
                        enemyDamage = (int)(Math.random() * 20) + 10;
                        enemyHp -= enemyDamage;
                        System.out.println("적에게 " + enemyDamage + "의 피해를 주었습니다.");
                    }
                }
                case 2 -> { // 방어
                    System.out.println("어느 부위를 방어 하시겠습니까?");
                    System.out.println("1: 상체 | 2: 하체");
                    defense = s.nextInt();

                    // 적이 공격하지 않고 방어를 한 경우
                    if (enemyAttack == 0 && enemyDefense != 0) {
                        hp += 20;
                        enemyHp += 20;
                        System.out.println("적도 방어를 선택했습니다. | 내 hp +20, 적 hp +20");
                        break;
                    }

                    // 적이 회복을 선택한 경우
                    if (enemyAttack == 0 && enemyDefense == 0) {
                        enemyHp += 40;
                        hp += 20;
                        System.out.println("적이 회복을 선택했습니다. | 내 hp +20, 적 hp +40");
                        break;
                    }

                    if (defense == enemyAttack) { // 적의 공격을 방어한 경우
                        hp += 20;
                        System.out.println("적의 공격을 방어하였습니다. | 내 hp +20");
                    } else { // 적의 공격에 방어를 실패한 경우
                        damage = (int)(Math.random() * 20) + 10;
                        hp -= damage;
                        System.out.println("적에게 " + damage + "의 피해를 입었습니다.");
                    }
                }
                case 3 -> { // 체력 회복을 선택하였으나 적이 공격한 경우 (체력 회복 불가)
                    if (enemyAttack != 0) {
                        damage = (int)(Math.random() * 20) + 10;
                        hp -= damage;
                        System.out.println("적에게 " + damage + "의 피해를 입었습니다.");
                    } else { // 체력 회복을 선택하고 적에게 공격받지 않은 경우 (체력 회복)
                        hp += 40;
                        System.out.println("체력이 40 회복 되었다.");
                    }
                }
            }

            System.out.println("-----------------------------------------");
            System.out.println("내 Hp: " + hp + "\t적 Hp:" + enemyHp);
            System.out.println("-----------------------------------------");
            System.out.println("적 공격: " + enemyAttack + "\t적 방어: " + enemyDefense);

            if(hp <= 0 || enemyHp <= 0){
                break;
            }
        }

        if(hp <= 0){
            System.out.println("당신은 사망했습니다. - The end -");
        }else if(enemyHp <= 0){
            System.out.println("전투에 승리했습니다. - The end -");
        }
    }
}