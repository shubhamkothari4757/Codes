Scanner sc= new Scanner(System.in);
	    
		System.out.println("Enter the string");
		String input = sc.next();
		
		StringBuilder str = new StringBuilder(input);
		
		
		
		int n=str.length(), flag=0;
		
		int i=0,j=n-1;
		
		for(i=0;i<n/2;i++) {
			if(str.charAt(i)!=str.charAt(j--)) {
				flag=1;
			}
		}

		if(flag==1) {
			System.out.println("string is not palindrom");
		}else {
			System.out.println("string is palindrom");
		}
