package com.training.junit;

	public class UserManager {

			private int userCount;

			public int getUserCount() {
				return userCount;
			}

			public void setUserCount(int userCount) {
				this.userCount = userCount;
			}

			// Test these methods
			int addUser(String user) {
				return userCount++;
			}

			void reset() {
				userCount = 0;
			}

	}
