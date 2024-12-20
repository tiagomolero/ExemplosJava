package br.com.molero;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

    public static void main(String[] agrs){
        Class clazz = Carro.class;

        try {
            //Contrutores da Classe default
            System.out.println("*** TODOS OS CONSTRUTORES ***");
            Constructor[] constructor1 = clazz.getDeclaredConstructors();
            for (Constructor c : constructor1){
                System.out.println(c);
            }

            //Contrutores da Classe default
            System.out.println();
            System.out.println("*** CONSTRUTOR DEFAULT ***");
            Constructor constructor2 = clazz.getConstructor();
            System.out.println(constructor2);

            //Instanciando um objeto com Reflections
            System.out.println();
            Carro car1 = (Carro) constructor2.newInstance();
            System.out.println("*** INSTÂNCIA DE "+ car1.getClass() +  " ***");
            System.out.println(car1);

            // Propriedades da Classe
            System.out.println();
            Field[] fields = car1.getClass().getDeclaredFields();
            System.out.println("*** FIEDS "+ car1.getClass() +  " ***");
            for (Field f : fields){
                System.out.println("Nome da propriedade: " + f.getName());
                System.out.println("Tipo da propriedade: " + f.getType().getSimpleName());

            }

            // Métodos da Classe
            System.out.println();
            System.out.println("*** TODOS OS MÉTODOS ***");
            Method[] methods = clazz.getDeclaredMethods();
            for(Method m : methods){
                System.out.println(m.getName() + " RETURN -> " + m.getReturnType().getSimpleName());
            }

            //Executar um método
            System.out.println();
            System.out.println("*** EXECUTANDO MÉTODOS ***");
            for (Method m : methods){
                if (m.getName().startsWith("set")) {
                    for(Class classesTyper : m.getParameterTypes()){
                        if(classesTyper.equals(String.class) && m.getName().equals("setCor")){
                            m.invoke(car1, "Azul");
                        }else if(classesTyper.equals(String.class) && m.getName().equals("setModelo")) {
                            m.invoke(car1, "Testa Model X");
                        }
                        else if(classesTyper.equals(Double.class)){
                            m.invoke(car1, 250d);
                        }
                    }
                }
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }

}
