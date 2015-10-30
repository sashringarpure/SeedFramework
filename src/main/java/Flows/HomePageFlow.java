package Flows;

import java.io.FileNotFoundException;

import Pages.Ecom;

import com.fanatics.seed.SeedFramework;

public class HomePageFlow {
	
	public void setQaEnv(SeedFramework seedFramework, Ecom ecom, String filePath, String env) {
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom.getHomePage() == null)
				System.out.println("ecom is null");
			ecom.getHomePage().setQaEnv(seedFramework.getSnakeYaml().getQAEnvFromYamlFile(filePath, env));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
	}
	
	public void setPartnerEnv(SeedFramework seedFramework, Ecom ecom, String filePath) {
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom.getHomePage() == null)
				System.out.println("ecom is null");
			ecom.getHomePage().setPartnerEnv(seedFramework.getSnakeYaml().getPartnerUrlFromYamlFile(filePath));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
	}
	
	public void setBrowser(SeedFramework seedFramework, Ecom ecom, String filePath) {
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom.getHomePage() == null)
				System.out.println("ecom is null");
			ecom.getHomePage().setBrowser(seedFramework.getSnakeYaml().getBrowserConfigFromYamlFile(filePath));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
	}
	
	public void setProductUrl(SeedFramework seedFramework, Ecom ecom, String filePath, String env, String partnerId, String key) {
		try {
			if (seedFramework.getSnakeYaml() == null) 
				System.out.println("seedframework is null");
			if (ecom.getHomePage() == null)
				System.out.println("ecom is null");
			ecom.getHomePage().setProductUrl(seedFramework.getSnakeYaml().getProductInfoFromYamlFile(filePath, env, partnerId, key));
	} catch (FileNotFoundException fnfex) {
		System.out.println("File not found : " + filePath);
		System.exit(0);
	}
	}

}
