System.out.println("Enter the value of numberator: ");
            int num = sc.nextInt();    
            System.out.println("Enter the value of denominator: ");
            int dim = sc.nextInt();

            double result = Calculator.divide(num, dim);

            System.out.println("the result is "+result)