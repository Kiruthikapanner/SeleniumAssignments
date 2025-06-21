package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Send the request to endpoint only: "+endpoint); 
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus ) {
		System.out.println("Send the request to endpoint: "+endpoint);
		System.out.println("Request body: "+requestBody);
		
		if(requestStatus) {
			System.out.println("Request success");
		}else {
			System.out.println("Request failed");
		}
	}
	
	public static void main(String[] args) {
		
		APIClient apiClientOptions = new APIClient();
		apiClientOptions.sendRequest("API endpoint URL");
		apiClientOptions.sendRequest("API endpoint URL", "API Endpoint Body", false);
		
	}

}
