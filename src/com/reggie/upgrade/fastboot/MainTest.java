package com.reggie.upgrade.fastboot;

public class MainTest {

	public static void main(String[] args) {

//		new Thread(new Runnable() {
//			UpgradePackage upgradePackage = new UpgradePackage();
//
//			@Override
//			public void run() {
//				upgradePackage.downloadfile();
//			}
//		}).start();
		
		
		UpgradePackage upgradePackage = new UpgradePackage();
		//����������
		upgradePackage.downloadfile();
		
		SystemUpgrade systemUpgrade = new SystemUpgrade();
		systemUpgrade.time_sleep(6);
		//fastbootˢ��
		systemUpgrade.fastbootflash();
	}

}
