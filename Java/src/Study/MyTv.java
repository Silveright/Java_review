package Study;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;

	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOff() {
		
		isPowerOn =!isPowerOn;
		
//		if (isPowerOn == true)
//			isPowerOn = false;
//		else isPowerOn = true;
	}
	void VolumeUP() {
		if(volume<MAX_VOLUME) {
			volume++;
		}
	}

	void VolumeDown() {
		if(volume>MIN_VOLUME) {
			volume--;
		}
	}
	
	void ChannelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel ++;
			
		}
	}
	void ChannelDown() {
		if(channel ==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			
			channel --;
		}
	}

	
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel =100;
		t.volume=0;
		System.out.println("CH:" +t.channel + ", VOL:" + t.volume);

		
		t.ChannelUp();
		t.VolumeDown();
		System.out.println("CH:" +t.channel + ", VOL:" + t.volume);
		
		t.volume =100;
		t.ChannelUp();
		t.VolumeUP();
		System.out.println("CH:" +t.channel + ", VOL:" + t.volume);
		
		
	}
}
