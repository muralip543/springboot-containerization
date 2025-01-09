package com.test.springboot.example;

import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;

@Service
public class MySecrets {

	public static String getSecret() {

	    String secretName = "MySecrets";
	   // Region region = Region.of("us-east-1");

	    // Create a Secrets Manager client
		/*
		 * AWSSecretsManagerClientBuilder.standard().withRegion(region)
		 * .withCredentials(new AWSStaticCredentialsProvider(new
		 * BasicAWSCredentials("AKIAXGZAMEBYCAV33DWY",
		 * "kDAYjZMHwesMyo4a8CzCciL/L/iq+sveEKG3MWyJ\r\n" + ""))) .build();
		 */

		AWSSecretsManager client = AWSSecretsManagerClientBuilder.standard().withRegion("us-east-1")
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("AKIAXGZAMEBYCAV33DWY",
						"kDAYjZMHwesMyo4a8CzCciL/L/iq+sveEKG3MWyJ\r\n" + "")))
				.build();
	    
	   

	    String secret;
        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
                .withSecretId(secretName);
        GetSecretValueResult getSecretValueResult = null;

        try {
            getSecretValueResult = client.getSecretValue(getSecretValueRequest);
        } catch (Exception e) {
            throw e;
        }
        if (getSecretValueResult.getSecretString() != null) {
            secret = getSecretValueResult.getSecretString();
            return secret;
        }


        return null;
    }
}
