        
        System.out.println("dictionary pages = " + dictionary.getPages()); // Valid.
        System.out.println("dictionary definitions = " + dictionary.getDefinitions()); // Valid.
        System.out.println("dictionary def. ratio = " + dictionary.computeRatio()); // Valid.
        
        System.out.println();
        
        System.out.println("dictionary3 pages = " + dictionary3.getPages()); // Valid.
//      System.out.println("dictionary3 definitions = " + dictionary3.getDefinitions()); // Invalid.
//      System.out.println("dictionary3 def. ratio = " + dictionary3.computeRatio()); // Invalid.

        System.out.println();
        System.out.println("dictionary4 = (Dictionary) dictionary3;");
        System.out.println();
        dictionary4 = (Dictionary) dictionary3; // Valid.
        
        System.out.println("dictionary4 pages = " + dictionary4.getPages()); // Valid.
        System.out.println("dictionary4 definitions = " + dictionary4.getDefinitions()); // Valid.
        System.out.println("dictionary4 def. ratio = " + dictionary4.computeRatio()); // Valid.        
        
//      dictionary4 = book; // Invalid.

//      dictionary4 = (Dictionary) book; // Invalid. It produces run-time error.
        
        System.out.println();
        System.out.println("book2 = dictionary;");
        System.out.println();
        book2 = dictionary;
        
        System.out.println("dictionary4 pages = " + book2.getPages()); // Valid.
//      System.out.println("dictionary4 definitions = " + book2.getDefinitions()); // Invalid.
//      System.out.println("dictionary4 def. ratio = " + book2.computeRatio()); // Invalid.                
        
    }
    
}
