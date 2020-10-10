import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

    public static void main(String[] args) {

        int x = 5;
        int y = x*2;
        double z = x/2 + y;
        System.out.println(z);

       /* User user = new User();
        user.email = "testEmail";
        user.name = "testName";
        User user1 = new User();
        List<User> users = Arrays.asList(user, user1, null);

        users.forEach(it -> {
            System.out.println(Optional
                    .ofNullable(it)
                    .map(u -> "Hi " + u.name)
                    .orElse("Hi guest"));
        });*/
    }


}

class User {
    String name;
    String email;
}

//
//    public List<FinancialTransaction> transactionsMerger = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Test test = new Test();
//        test.transactionsMerger.add(new FinancialTransaction(1, 2, 100));
//        test.transactionsMerger.add(new FinancialTransaction(1, 2, 100));
//        test.transactionsMerger.add(new FinancialTransaction(1, 3, 100));
//        test.merge();
//    }
//
//    public void merge() {
//        Iterator<FinancialTransaction> financialTransactionIterator =
//                transactionsMerger.iterator();
//
//        for (int i = 0; i < transactionsMerger.size() - 1; i++) {
//            for (int j = 1; j < transactionsMerger.size(); j++) {
//                if (transactionsMerger.get(i).getSrc() == transactionsMerger.get(j).getSrc() &&
//                        transactionsMerger.get(i).getDst() == transactionsMerger.get(j).getDst()) {
//
//                    transactionsMerger.get(i).setAmount(transactionsMerger.get(i).getAmount() +
//                            transactionsMerger.get(j).getAmount());
//                    transactionsMerger.get(j).setAmount(0);
//                }
//            }
//        }
//
//        while (financialTransactionIterator.hasNext()) {
//            FinancialTransaction next = financialTransactionIterator.next();
//            if (next.getAmount() == 0) {
//                financialTransactionIterator.remove();
//            }
//        }
//        System.out.println("объединяем: " + transactionsMerger);
//    }
//}

//    final Account a = new Account(1000);
//    final Account b = new Account(2000);
//
//    new Thread(() -> {
//        try {
//            transfer(a, b, 500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }).start();
//
//        try {
//            transfer(b, a, 300);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    static void transfer (Account acc1, Account acc2, int amount)
//            throws InterruptedException {
//            synchronized (acc1){
//                Thread.sleep(1000);
//                synchronized (acc2){
//                    acc1.withdraw(amount);
//                    acc2.deposit(amount);
//                    System.out.println("Transfer OK");
//                }
//            }
//
//
//    }
//}
////---------------------потоки ---------InsufficientFundsException---------------------------------------------------
//class Account {
//    private int balance;
//
//    public Account(int initialBalance) {
//        this.balance = initialBalance;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void withdraw(int amount) {
//        balance -= amount;
//    }
//
//    public void deposit(int amount) {
//        balance += amount;
//    }
//}
//
//
//
////----------------------------------------------------------------------------------------
////
////class Worker {
////    Object lock1 = new Object();
////    Object lock2 = new Object();
//    private List<Integer> list1 = new ArrayList<>();
//    private List<Integer> list2 = new ArrayList<>();
//    Random random = new Random();
//
//    public void addList1() {
//        synchronized (lock1) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            list1.add(random.nextInt(100));
//        }
//        }
//
//    public void addList2() {
//        synchronized (lock1) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            list2.add(random.nextInt(100));
//
//        }
//    }
//
//    public void work (){
//        for (int i = 0; i < 1000; i++){
//            addList1();
//            addList2();
//        }
//    }
//    public void main () {
//        long before = System.currentTimeMillis();
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                work();
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                work();
//            }
//        });
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        long after = System.currentTimeMillis();
//        System.out.println("Time: " + (after - before));
//        System.out.println("List1: " + list1.size());
//        System.out.println("List1: " + list2.size());
//    }
//}
//
//
//
//
//
//
////        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>(){
////            @Override
////            public int compare(Integer integer, Integer t1) {
////                if(integer % 2 == 0 && t1 % 2 != 0) {
////                    return -1;
////                } else if(integer % 2 != 0 && t1 % 2 == 0) {
////                    return 1;
////                } else if(integer % 2 == 0 && t1 % 2 == 0) {
////                    return 0;
////                } else if (integer > t1) {
////                    return 1;
////                } else if (integer.equals(t1)) {
////                    return 0;
////                } else return -1;
////            }
////        });
////        q.add(5);
////        q.add(2);
////        q.add(1);
////        q.add(4);
////        while (!q.isEmpty()) {
////            System.out.println(q.poll());
////        }
////    }
////    static void foo (String test) throws AllException{
////        System.out.println("Begin");
////        if (test.equals("yes"))
////            throw new AllException();
////        System.out.println("End");
////    }
//
//
//
