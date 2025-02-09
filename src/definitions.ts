export interface PhoneHintPlugin {
  getPhoneNumber(): Promise<{ phoneNumber: string }>;
}
